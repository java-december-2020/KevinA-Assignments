package com.example.demo.BookController;

import com.example.demo.BookService.BookService;
import com.example.demo.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BooksController {
    @Autowired
    BookService service;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = service.allBooks();
        model.addAttribute("books", books);
        return "/view/index.jsp";

    }

    @RequestMapping("/showBook/{id}")
    public String showBook(@PathVariable(name = "id") long id, Model model) {
        model.addAttribute("book", service.getBookById(id));
        return "/view/showBook.jsp";
    }

    @RequestMapping("/{id}")
    public String showBooks(@PathVariable(name = "id") long id, Model model) {
        model.addAttribute("book", service.getBookById(id));
        return "/view/show.jsp";
    }


    @RequestMapping("/view/newBook")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/view/newBook.jsp";

    }

    @PostMapping("/createBook")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError());
            return "/view/newBook.jsp";
        } else {
            service.createBook(book);
            return "redirect:/books";

        }

    }

    @RequestMapping("/view/editBook/{id}")
    public String updatedBook(@PathVariable("id") long id, Model model) {
        Book book = service.getBookById(id);
        if (book != null) {
            model.addAttribute("book", book);
            return "/view/editBook.jsp";
        } else {
            return "redirect:/books";
        }

    }

    @RequestMapping(value = "/view/edit/{id}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id") long id, @Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/editBook.jsp";
        } else {
            service.updateBook(id, book);
            return "redirect:/books";

        }

    }


    @RequestMapping(value = "/view/delete/{id}")
    public String deleteBook(@PathVariable("id") long id) {
         service.removeBook(id);
        return "redirect:/books";
    }




//    @RequestMapping(value = "/view/edit/{id}", method = RequestMethod.PUT)
//    public String updateBook(@PathVariable("id") long id, @Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "/editBook.jsp";
//        } else {
//            service.updateBook(id, book);
//            return "redirect:/books";
//
//        }
//
//    }
}




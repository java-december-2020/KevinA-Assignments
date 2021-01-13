package com.example.demo.BookController;

import com.example.demo.BookService.BookService;
import com.example.demo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookApi {
    @Autowired
    BookService bookService;

    @RequestMapping("/getAll")
    public List<Book> getBooks(){
        return bookService.allBooks();
    }

    @PostMapping("/createbooks")
    public Book createBooks(Book book){
        return bookService.createBook(book);
    }

    @DeleteMapping("/deletebooks/{id}")
    public void deleteBook(@PathVariable("id") long id){
         bookService.removeBook(id);
    }

}

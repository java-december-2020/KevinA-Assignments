package com.example.demo.BookService;

import com.example.demo.BookRepository.BookRepository;
import com.example.demo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book newBook) {
        return this.bookRepository.save(newBook);
    }

    public Book getBookById(long id) {
        return this.bookRepository.findBookById(id);

    }


    public Book updateBook(long id, Book book) {
        Book updatedBook = this.getBookById(id);
        if (updatedBook.getId() != null) {
            return bookRepository.save(book);
        } else {
            return null;
        }
//        if (book.getId() == null) {
//            book.setId(id);
//        }

    }


    public void removeBook(long id) {
       bookRepository.deleteById(id);

    }


}


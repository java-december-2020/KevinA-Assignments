package com.example.demo.BookRepository;

import com.example.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
    Book removeBooksById(long id);
    Book findBookById(long id);
    List<Book> countAllById(long id);


}

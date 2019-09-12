package com.jamesqi.restservice.RestApp.controller;

import com.datastax.driver.core.utils.UUIDs;
import com.jamesqi.restservice.RestApp.model.Book;
import com.jamesqi.restservice.RestApp.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/book/create")
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book) {
        book.setId(UUIDs.timeBased());
        Book _book = bookRepository.save(book);
        return new ResponseEntity<>(_book, HttpStatus.OK);
    }
}

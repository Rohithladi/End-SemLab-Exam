package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }
}

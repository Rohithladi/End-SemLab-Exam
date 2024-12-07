package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book updateBook(int id, Book bookDetails) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setTitle(bookDetails.getTitle());
            existingBook.setAuthor(bookDetails.getAuthor());
            existingBook.setGenre(bookDetails.getGenre());
            existingBook.setPrice(bookDetails.getPrice());
            existingBook.setPublishedYear(bookDetails.getPublishedYear());

            return bookRepository.save(existingBook);
        } else {
            throw new RuntimeException("Book not found with ID: " + id);
        }
    }
}

package com.example.demo;

import com.example.repository.BookRepository;
import com.example.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Manual Constructor Injection
        BookService bookService = new BookService("Manual Book Service");

        // Manual Setter Injection
        BookRepository bookRepository = new BookRepository();
        bookService.setBookRepository(bookRepository);

        // Use the service
        bookService.listBooks();
    }
}

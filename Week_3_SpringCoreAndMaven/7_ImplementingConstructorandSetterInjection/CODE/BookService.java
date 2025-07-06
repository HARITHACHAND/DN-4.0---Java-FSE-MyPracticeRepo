package com.example.service;

import com.example.repository.BookRepository;

public class BookService {
    private String serviceName; 
    private BookRepository bookRepository; 

    // Constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor injection: " + serviceName);
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        if (bookRepository != null) {
            bookRepository.displayBooks();
        } else {
            System.out.println("BookRepository not set!");
        }
    }
}

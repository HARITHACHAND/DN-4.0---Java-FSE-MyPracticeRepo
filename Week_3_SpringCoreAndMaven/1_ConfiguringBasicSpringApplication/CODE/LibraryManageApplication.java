package com.example.LibraryManage;

import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.library", "com.example.LibraryManage"})  
public class LibraryManageApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(LibraryManageApplication.class, args);
    }

    @Override
    public void run(String... args) {
        bookService.displayBooks();
    }
}



package com.example.Library;

import com.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.library")
public class LibraryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);

        BookService bookService = context.getBean(BookService.class);
        bookService.displayBooks();
    }
}

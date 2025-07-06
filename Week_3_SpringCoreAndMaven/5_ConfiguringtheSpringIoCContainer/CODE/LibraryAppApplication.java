//package com.example.demo;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class LibraryAppApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(LibraryAppApplication.class, args);
//	}
//
//}
package com.example.demo;

import com.example.repository.BookRepository;
import com.example.service.BookService;

public class LibraryAppApplication {
    public static void main(String[] args) {
        // Manual wiring (no Spring)
        BookRepository repo = new BookRepository();
        BookService service = new BookService();
        service.setBookRepository(repo); // Manual dependency injection

        service.listBooks();
    }
}

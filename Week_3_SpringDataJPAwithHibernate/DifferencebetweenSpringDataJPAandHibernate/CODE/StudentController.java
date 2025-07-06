//package com.example.demo.controller;
//
//import com.example.demo.model.Student;
//import com.example.demo.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/students")  // VERY IMPORTANT
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping
//    public Student create(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @GetMapping
//    public List<Student> getAll() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("/course/{course}")
//    public List<Student> getByCourse(@PathVariable String course) {
//        return studentRepository.findByCourse(course);
//    }
//    @GetMapping("/students/test")
//    public String hello() {
//        return "Working!";
//    }
//
//}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students/test")
    public String hello() {
        return "Working!";
    }
}


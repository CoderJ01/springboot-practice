package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    // REST endpoint
    @GetMapping // allows method to be served
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,"Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21)
        );
    }
}

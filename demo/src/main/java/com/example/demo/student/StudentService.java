package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentReopistory;

    @Autowired
    public StudentService(StudentRepository studentReopistory) {
        this.studentReopistory = studentReopistory;
    }

    // REST endpoint
    @GetMapping // allows method to be served
    public List<Student> getStudents() {
        return studentReopistory.findAll();
    }
}

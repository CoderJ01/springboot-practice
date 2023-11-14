package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;
import java.util.*;
import java.time.LocalDate;


@SpringBootApplication
@RestController // allows class to server REST endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// hello() is a REST endpoint
 	@GetMapping // allows method to be served
	public List<Student> hello() {
		return List.of(
				new Student(1L,"Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21)
		);
	}
}

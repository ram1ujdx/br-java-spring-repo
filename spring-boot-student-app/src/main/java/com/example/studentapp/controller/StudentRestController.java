package com.example.studentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int studentId) {
		return service.getStudentById(studentId);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
	
		return service.addStudent(student);
		
		
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	
}

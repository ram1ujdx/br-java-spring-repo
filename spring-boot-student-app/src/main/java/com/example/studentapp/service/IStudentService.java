package com.example.studentapp.service;

import java.util.List;

import com.example.studentapp.model.Student;

public interface IStudentService {

	public Student addStudent(Student student);
	public Student getStudentById(int studentId);
	public void deleteStudent(int studentId);
	public Student updateStudent(Student student);
	public List<Student> getAllStudent();
	
}

package com.example.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentapp.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
	
}

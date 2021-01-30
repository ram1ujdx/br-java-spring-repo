package com.example.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapp.exception.StudentAlreadyExistException;
import com.example.studentapp.exception.StudentNotFoundException;
import com.example.studentapp.model.Student;
import com.example.studentapp.repository.IStudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo repo;
	
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		if(repo.existsById(student.getStudentId())) {
			throw new StudentAlreadyExistException("Student with ID : "+student.getStudentId()+" is already Present");
		}
		return repo.save(student);
		
		
		
	}

	@Override
	public Student getStudentById(int studentId) {
		return repo.getOne(studentId);
	}

	@Override
	public void deleteStudent(int studentId) {
		
		repo.deleteById(studentId);

	}

	@Override
	public Student updateStudent(Student student) {
		
		if(!repo.existsById(student.getStudentId())) {
			throw new StudentNotFoundException("Student with ID : "+student.getStudentId()+" Not Found");
		}
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

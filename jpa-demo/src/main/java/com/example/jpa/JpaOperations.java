package com.example.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.jpa.model.Student;

public class JpaOperations {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("student.pu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		Student student=new Student("Navin", "navin@gmail.com");
		
		tx.begin();
		em.persist(student);
		tx.commit();
		System.out.println("Student Saved");
		

	}

}

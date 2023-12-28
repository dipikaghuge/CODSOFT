package com.dipika.basic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dipika.basic.entity.Student;
import com.dipika.basic.service.StudentService;

public class StudentDaoImpl implements StudentDao{

	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("Dipu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String addRecord(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return "add record successfully";
	}

	public String updateRecord(Student student) {
		entityTransaction.begin();
		Student stud= entityManager.find(Student.class,student.getStudentId());
        stud.setStudentName(student.getStudentName());
        stud.setPassword(student.getPassword());
        stud.setStudentAddress(student.getStudentAddress());
        stud.setStudentEmail(student.getStudentEmail());
        entityTransaction.commit();
		return "Update record successfully";
	}

	public String deleteRecord(Student student) {
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return "Delete record successfully";
	}

	public Student findRecord(Integer studentId) {
		return entityManager.find(Student.class, studentId);
	}

	public List<Student> findAllRecord() {
		String jpql="from Student s";
		Query q=entityManager.createQuery(jpql);
		return q.getResultList();
	}

}

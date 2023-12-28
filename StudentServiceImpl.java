package com.dipika.basic.service;

import java.util.List;

import com.dipika.basic.dao.StudentDao;
import com.dipika.basic.dao.StudentDaoImpl;
import com.dipika.basic.entity.Student;

public class StudentServiceImpl implements StudentService{

	StudentDao studentDao=new StudentDaoImpl();
	
	public String addRecord(Student student) {
		return studentDao.addRecord(student);
	}

	public String updateRecord(Student student) {
		return studentDao.updateRecord(student);
	}

	public String deleteRecord(Integer studentId) {
		Student student=findRecord(studentId);
		if(student!=null)
		{
			return studentDao.deleteRecord(student);
		}
		return"object not found";
		
	}

	public Student findRecord(Integer studentId) {
		return studentDao.findRecord(studentId);
	}

	public List<Student> findAllRecord() {
		return studentDao.findAllRecord();
	}
}

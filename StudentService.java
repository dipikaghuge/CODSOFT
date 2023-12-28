package com.dipika.basic.service;

import java.util.List;
import com.dipika.basic.entity.Student;

public interface StudentService 
{
	String addRecord(Student student);
	String updateRecord(Student student);
	String deleteRecord(Integer studentId);
	Student findRecord(Integer studentId);
	List<Student> findAllRecord();
}

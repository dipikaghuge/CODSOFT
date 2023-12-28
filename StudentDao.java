package com.dipika.basic.dao;

import java.util.List;

import com.dipika.basic.entity.Student;

public interface StudentDao 
{
	String addRecord(Student student);
	String updateRecord(Student student);
	String deleteRecord(Student student);
	Student findRecord(Integer empNumber);
	List<Student> findAllRecord();
}

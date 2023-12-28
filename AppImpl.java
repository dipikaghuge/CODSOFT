package com.dipika.basic.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dipika.basic.entity.Student;
import com.dipika.basic.service.StudentService;
import com.dipika.basic.service.StudentServiceImpl;
import com.dipika.basic.validation.MyValidation;

public class AppImpl implements App{

	Scanner scanner=new Scanner(System.in);
	StudentService studentService=new StudentServiceImpl();
	
	public void addRecord() {
		while(true)
		{
	        boolean flagStudentName=true;
	    	boolean flagStudentPassword=true;
	    	boolean flagStudentEmailId=true;
	    	boolean flagStudentContactNo=true;
	    	while(flagStudentName) {
			System.out.println("Enter the Student Name::");
			String studentName=scanner.next();
			if(MyValidation.isValidStudentName(studentName))
			{
				flagStudentName=false;
			while(flagStudentEmailId) {	
			System.out.println("Enter the Student Email Id::");
			String studentEmailId=scanner.next();
			if(MyValidation.isValidStudentEmailId(studentEmailId)) 
			{
				flagStudentEmailId=false;
			while(flagStudentContactNo)
			{
			System.out.println("Enter the Student Contact No::");
			String studentContactNo1=scanner.next();
			if(com.dipika.basic.validation.MyValidation.isValidStudentContactNo(studentContactNo1)) {
				flagStudentContactNo=false;
			while(flagStudentPassword) {	
			System.out.println("Enter the Password::");
			String password=scanner.next();
			if(MyValidation.isValidStudentPassword(password)) {
			flagStudentPassword=false;
			
			Student student=new Student();
			student.setStudentName(studentName);
			student.setStudentEmail(studentEmailId);
			student.setStudentContactNo(studentContactNo1);
			student.setPassword(password);
			System.out.println(studentService.addRecord(student));
			}else {
				System.out.println("Enter valid password");
			 }
			}
			}
			else {
				System.out.println("Enter valid contact no.");
			}
			}
			}else {
				System.out.println("Enter valid EmailId");
			}
			}
			}else {
				System.out.println("Enter valid student name");
			}  
	    	}
             
             System.out.println("Do you want to add more object:");
             String ch=scanner.next();
             if(ch.equals("no"))
             {
            	 System.out.println("user does not want to add more object ..thank you");
            	 break;
             }
		}
	}

	public void updateRecord() {
		while(true) {
			System.out.println("Student Id:");
			Integer studentId=scanner.nextInt();
			Student student=studentService.findRecord(studentId);
			if(student!=null)
			{
				System.out.println("Enter the Student Name::");
				String studentName=scanner.next();
				System.out.println("Enter the Student Email::");
				String studentEmail=scanner.next();
				System.out.println("Enter the Student Address::");
				String studentAddress=scanner.next();
				System.out.println("Enter the Student Password::");
				String password=scanner.next();
				System.out.println("Enter the Student Contact No::");
				String studentContactNo=scanner.next();


	             student=new Student();
	             student.setStudentName(studentName);
	             student.setPassword(password);
	             student.setStudentAddress(studentAddress);
	             student.setStudentContactNo(studentContactNo);
	             student.setStudentEmail(studentEmail);
	             
	             System.out.println(studentService.updateRecord(student));
			}
			else {
				System.out.println("Object not found");
			}
            System.out.println("Do you want to add more object:");
            String ch=scanner.next();
            if(ch.equals("no"))
            {
           	 System.out.println("user does not want to add more object ..thank you");
           	 break;
            }

		}
	}

	public void deleteRecord() {
		while(true){
			System.out.println("Student Id :");
			Integer studentId=scanner.nextInt();

            System.out.println(studentService.deleteRecord(studentId));

            System.out.println("Do you want to add more object:");
            String ch=scanner.next();
            if(ch.equals("no"))
            {
           	 System.out.println("user does not want to add more object ..thank you");
           	 break;
            }

		}
	}

	public void findRecord() {
			System.out.println("Student Id :");
			Integer studentId=scanner.nextInt();

			Student student= studentService.findRecord(studentId);
            
            if(student!=null)
            {
            	System.out.println("Student Id :"+student.getStudentId());
            	System.out.println("Student Name:"+student.getStudentName());
            	System.out.println("Student Email:"+student.getStudentEmail());
            	System.out.println("Student Address:"+student.getStudentAddress());
            	System.out.println("Student ContactNo:"+student.getStudentContactNo());
            }
            else {
            	System.out.println("Object not found");
            }
			
		}
	

	public void findAllRecord() {
			List<Student> l=studentService.findAllRecord();
			Iterator<Student> itr=l.iterator();
			
			System.out.println("____________");
			System.out.println("Student Id\t Studnet Name\t Student Email \t Student Address \t Student Contact");
			System.out.println("____________");

			while(itr.hasNext())
			{
				Student s=itr.next();
				System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentEmail()+"\t"+s.getStudentAddress()+"\t"+s.getStudentContactNo());
			}	
		}
	}


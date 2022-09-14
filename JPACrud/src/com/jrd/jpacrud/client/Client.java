package com.jrd.jpacrud.client;

import com.tns.jpacrud.entites.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;
public class Client {
public static void main(String[] args) {

	
StudentService service = new StudentServiceImpl();
Student student = new Student();



student.setStudentId(01);
student.setName("vijay");
service.addStudent(student);



student = service.findStudentById(01);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName()); 



student = service.findStudentById(02);
student.setName("arun");
service.updateStudent(student);



student = service.findStudentById(02);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName()); 



student = service.findStudentById(01);
service.removeStudent(student);
System.out.println("End of program/Life cycle completed..."); 
}
}
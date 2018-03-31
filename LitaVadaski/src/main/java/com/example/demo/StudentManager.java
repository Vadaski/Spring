package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManager {
	@Autowired
	Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void show() {
		System.out.println("Student-Id : "+student.getId());
		System.out.println("Student-name : "+student.getName());
	}
}

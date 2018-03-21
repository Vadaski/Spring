package com.example.demo;

import javax.xml.ws.Action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("Student")
public class Student {
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
//	@Value("#{systemProperties['os.name']}")
//	private String systemID;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getSystemId() {
//		return this.systemID;
//	}
}
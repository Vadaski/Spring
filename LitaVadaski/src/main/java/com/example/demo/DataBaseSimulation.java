package com.example.demo;
import java.util.ArrayList;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DataBaseSimulation {
	
	private ArrayList<Integer> id = new ArrayList<Integer>();
	private ArrayList<String> name = new ArrayList<String>();

	public void add(Student student) {
		id.add(student.getId());
		name.add(student.getName());
	}
	
	public void delete(int id) {
		for (int i = 0; i < this.id.size(); i++) {
			if(this.id.get(i)==id) {
				this.id.remove(this.id.get(i));
				this.name.remove(this.name.get(i));
			}
		}
	}
	
	public String showName(int id) {
		for (int i = 0; i < this.id.size(); i++) {
			if(this.id.get(i)==id) {
				System.out.println("成功查询到id为:"+id+"姓名为"+this.name.get(i)+"的学生");
				return this.name.get(i);
			}
		}
		return null;
	}
	
}

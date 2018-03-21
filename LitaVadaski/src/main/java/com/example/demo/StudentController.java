package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("StudentController")
public class StudentController {
	@Autowired
	DataBaseSimulation dataBaseSimulation;
	
	@GetMapping(value = "/{id}",produces = "application/json")
	public String getStudent(@PathVariable int id) {
		if (dataBaseSimulation.showName(id)==null) {
			System.out.println("未查询到该学生");
			return "未查询到该学生";
		}
		return dataBaseSimulation.showName(id);
	}
	@PutMapping(value = "/{id}/{name}",produces = "application/json")
	public Student setStudent(@PathVariable int id,String name) {
		Student student = new Student(id, name);
		dataBaseSimulation.add(student);
		System.out.println("成功添加id为"+id+"姓名为"+name+"的学生");
		return student;
	}
	
}

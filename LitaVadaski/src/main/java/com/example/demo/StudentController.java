package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/StudentController")
public class StudentController {
	@Autowired
	DataBaseSimulation dataBaseSimulation;
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);

	@GetMapping(value = "/{id}")
	public String getStudent(@PathVariable("id") int id) {
		if (dataBaseSimulation.showName(id)==null) {
			log.info("Student not found");;
			log.error("error test");
			log.trace("trace test");
			return "未查询到该学生";
		}
		return dataBaseSimulation.showName(id);
	}

}

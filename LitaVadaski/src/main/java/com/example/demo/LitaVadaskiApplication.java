package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LitaVadaskiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DIConfig.class);
		StudentManager studentManager = context.getBean(StudentManager.class);//我们让Spring给我们一个StudentManager的Bean
		Student student = context.getBean(Student.class); //我们让Spring给我们一个Student的Bean
		//我们用Show去输出StudentManager管理的的name和id
//		System.out.println(student.getId()); //让这个Student的Bean输出一下你的id
//		System.out.println(student.getName());//让这个Student的Bean输出一下你的name
//		student.setId(1);					//我们修改一下Student的Bean的id
	//	studentManager.show();				//让StudentManager去Show一下你依赖的Student
		context.close();
		}
}

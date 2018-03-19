package com.example.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MemberSignature;
import org.springframework.stereotype.Component;
@Aspect
@Component

public class AOPtest {
	
	@Pointcut("execution(* com.example.demo.StudentManager.*(..))")
	public void studentCut() {
	}
	
	@Before("studentCut()")
	public void start() {
		System.out.println("start");
	}
	
	@After("studentCut()")
	public void end() {
		System.out.println("end");
	}
	
	@Before("execution(* com.example.demo.StudentManager.*(..))")
	public void beforeIt() {
		System.out.println("Before Do It");
	}
}

package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.demo")
@EnableAspectJAutoProxy
@PropertySource("classpath:resourse.properties")
public class DIConfig {
}

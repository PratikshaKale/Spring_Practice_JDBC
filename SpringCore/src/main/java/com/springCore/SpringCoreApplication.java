package com.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		System.out.println("This is First Spring Practical");
		ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
		Student student1=(Student) context.getBean("student1");
		System.out.println("student1");
	}

}

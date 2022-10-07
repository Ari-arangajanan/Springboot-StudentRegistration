package com.sgic.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableAutoConfiguration
public class StudentRegistartionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistartionApplication.class, args);
	}

}

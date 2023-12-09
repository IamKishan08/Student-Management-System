package com.TaskManagementSystem.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.TaskManagementSystem.project.entity.*;
import com.TaskManagementSystem.project.repository.*;


@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
	
	}

}

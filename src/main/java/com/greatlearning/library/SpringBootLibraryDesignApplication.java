package com.greatlearning.library;

import com.greatlearning.library.model.GreatLearning;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
    	System.out.println("Hi Spring Boot");
	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("Java");
		gl.setCourseType("Programming Language");
		gl.setCourseTutor("JK");
		System.out.println("Course details:"+gl.toString());
		GreatLearning gl2= new GreatLearning("Backend","Lombok Testing","JK");
		System.out.println("Course details:"+gl2.toString());


	}

}

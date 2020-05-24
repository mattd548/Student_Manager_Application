package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class StudentManagerApplication {
	private static final Logger log = LoggerFactory.getLogger(StudentManagerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StudentManagerApplication.class, args);
	}


	  @Bean
	  public CommandLineRunner demo(StudentRepository repository) {
	    return (args) -> {
	      // save a few students
	      repository.save(new Student("Matt", "smith"));
	      repository.save(new Student("Chloe","kardashin"));
	      repository.save(new Student("tim", "wordly"));
	      repository.save(new Student("David", "joget"));
	      repository.save(new Student("Michelle", "gonzalez"));

	      // fetch all students
	      log.info("Students found with findAll():");
	      log.info("-------------------------------");
	      for (Student student : repository.findAll()) {
	        log.info(student.toString());
	      }
	      log.info("");

	      // fetch an individual student by ID
	      Student student = repository.findById(1L);
	      log.info("student found with findById(1L):");
	      log.info("--------------------------------");
	      log.info(student.toString());
	      log.info("");

	      // fetch students by last name
	      log.info("Student found with findByLastName('smith'):");
	      log.info("--------------------------------------------");
	      repository.findByLastName("smith").forEach(smith -> {
	        log.info(smith.toString());
	      });
	      
	      log.info("");
	    };
	  }
	
	
	
	
	
}

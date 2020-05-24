package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student,Long> {

	  List<Student> findByLastName(String lastName);

	  Student findById(long id);

}

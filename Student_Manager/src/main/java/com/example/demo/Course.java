package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int credits;
	private String name;
	private String description;
	
	
	
	
public void setId(int id) {
	this.id=id;
}

public int getId() {
	return id;
}
public void setCredits(int credits) {
	this.credits= credits;
	
}

public int getCredits() {
	return credits;
}
public void setName(String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setDescription(String description) {
	this.description= description;
	
}
public String getDescrpition() {
	return description;
}

}

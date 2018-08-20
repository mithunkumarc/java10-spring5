package com.example.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {

   @Size(max = 20, min = 3, message = "{student.name.empty}")
   private String name;

   @NotEmpty(message = "{student.subjects.empty}")
   private List<String> subjects;
   
   @NotEmpty(message = "{student.email.empty}")		
   @Email(message = "{student.email.invalid}")
	private String email;
   
   public List<String> getSubjects() {
	return subjects;
   }

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	

   @NotEmpty(message = "{student.gender.empty}")
   private String gender;

   

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

}

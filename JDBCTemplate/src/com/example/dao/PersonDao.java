package com.example.dao;



import java.util.List;

import com.example.model.Person;

public interface PersonDao {
	Person getPersonById(int id);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}

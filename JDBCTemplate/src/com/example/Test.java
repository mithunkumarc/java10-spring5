package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.Person;
import com.example.config.AppConfig;
import com.example.dao.PersonDao;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDao personDAO = context.getBean(PersonDao.class);

		System.out.println("List of person is:");

		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

		System.out.println("\nGet person with ID 2");

		Person personById = personDAO.getPersonById(2);
		System.out.println(personById);

		System.out.println("\nCreating person: ");
		Person person = new Person(36, "Sergey", "Emets");
		System.out.println(person);
		personDAO.createPerson(person);
		System.out.println("\nList of person is:");

		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

/*		System.out.println("\nDeleting person with ID 2");
		personDAO.deletePerson(personById);

		System.out.println("\nUpdate person with ID 4");

		Person pperson = personDAO.getPersonById(4);
		pperson.setLastName("CHANGED");
		personDAO.updatePerson(pperson);

		System.out.println("\nList of person is:");
		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}*/

		context.close();
	}
}

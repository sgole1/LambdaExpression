package com.lambda.test;

import java.util.ArrayList;
import java.util.List;

import com.lambda.entity.Person;
import com.lambda.test.service.PersonFilterService;

public class FilterPersonTest {
	public static void main (String args[]){
		Person p1 = new Person("Sumit", "female", 34, "Gurgaon",
 "Haryana");
		Person p2 = new Person("Niren", "male", 40, "Gurgaon", "Haryana");
		Person p3 = new Person("Suryansh", "male", 9, "Gurgaon", "Haryana");
		Person p4 = new Person("Jia", "female", 6, "Gurgaon", "Haryana");
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		PersonFilterService service = new PersonFilterService();
		firstApproach(persons, service);
		//perform the same with aggregate functions
		persons.stream().filter((Person p)->p.getGender().equals("female")).map(p->p.getName()
				).forEach(name -> System.out.println(name));

	}

	private static void firstApproach(List<Person> persons,
			PersonFilterService service) {
		//get all persons having age > 20
		service.printPerson(persons, (p)-> {return p.getAge()<20 ;});
		//get all persons who are female
		service.printPerson(persons, (p)-> {return p.getGender().equals("female") ;});
	}

}

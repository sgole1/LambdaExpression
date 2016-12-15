package com.lambda.test.service;

import java.util.List;

import com.lambda.entity.Person;
import com.lambda.test.criteria.PersonCriteria;

public class PersonFilterService {
	
	public void printPerson(List<Person> persons, PersonCriteria pc ){
		for(Person p : persons){
			if(pc.testPerson(p))
			System.out.println("Name :"+p.getName());
		}
	}

}

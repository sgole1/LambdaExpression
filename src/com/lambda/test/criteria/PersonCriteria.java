package com.lambda.test.criteria;

import com.lambda.entity.Person;
@FunctionalInterface
public interface PersonCriteria {
	boolean testPerson(Person p);

}

package com.cisc181.core;

public class PersonException extends Exception {
	private Person person;
	
	public PersonException(Person person) {
		this.person = person;
		if (this.person.getDOB() == null) {
			System.out.println("Incorrect date of birth input.");
		}
		else
			System.out.println("Incorrect phone number format.");
	}
	
}


package com.cisc181.core;

/**
 * @author Andrew
 *Declaration of the PersonException
 */
public class PersonException extends Exception {
	//Takes in an instance of Person
	private Person person;
	
	/**
	 * Determines how the exception was thrown and prints a statement accordingly
	 * @param person
	 */
	public PersonException(Person person) {
		this.person = person;
		if (this.person.getDOB() == null) {
			System.out.println("Incorrect date of birth input.");
		}
		else
			System.out.println("Incorrect phone number format.");
	}
	
}


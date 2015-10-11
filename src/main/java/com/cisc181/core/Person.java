package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public abstract class Person {

	private Calendar DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	/**
	 * Returns the first name of the person
	 * @return
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * Set the first name of the person
	 * @param FirstName
	 */
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	/**
	 * Returns the middle name of the person
	 * @return
	 */
	public String getMiddleName() {
		return MiddleName;
	}

	/**
	 * Sets the middle name of the person
	 * @param MiddleName
	 */
	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	/**
	 * Returns the last name of the person
	 * @return
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * Sets the last name of the person
	 * @param LastName
	 */
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	/**
	 * Returns the date of birth of the person
	 * @return
	 */
	public Calendar getDOB() {
		return DOB;
	}


	/**
	 * Sets the date of birth for a person. May throw a personException if incorrect date entered
	 * @param DOB
	 * @throws PersonException
	 */
	public void setDOB(Calendar DOB) throws PersonException {
		Calendar currentDate = Calendar.getInstance();
		if (DOB.get(Calendar.YEAR) < ((currentDate.get(Calendar.YEAR)) - 100) ) {
			throw new PersonException(this);
		}
		else
			this.DOB = DOB;
	}

	/**
	 * Sets the address of a person
	 * @param newAddress
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	/**
	 * Returns the address of a person
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the phone number of a person. May throw a PersonException if it is not the right format
	 * @param newPhone_number
	 * @throws PersonException
	 */
	public void setPhone(String newPhone_number) throws PersonException{
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(newPhone_number);
		if (matcher.matches()) {
			phone_number = newPhone_number;
		}
		else
			throw new PersonException(this);
	}

	/**
	 * Returns the phone number of a person
	 * @return
	 */
	public String getPhone() {
		return phone_number;
	}

	/**
	 * Sets the email of a person
	 * @param newEmail
	 */
	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	/**
	 * Returns the email of a person
	 * @return
	 */
	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	/**
	 * Overloaded constructor for Person which may throw a PersonException
	 * @param FirstName
	 * @param MiddleName
	 * @param LastName
	 * @param DOB
	 * @param Address
	 * @param Phone_number
	 * @param Email
	 * @throws PersonException
	 */
	public Person(String FirstName, String MiddleName, String LastName,
			Calendar DOB, String Address, String Phone_number, String Email) throws PersonException {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.setDOB(DOB);
		this.setPhone(Phone_number);
		this.address = Address;
		this.email_address = Email;
		
	}

	/**
	 * Prints the name of the person
	 */
	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	/**
	 * Prints the date of birth of the person
	 */
	public void PrintDOB() {
		System.out.println(this.DOB);
	}
	
	
	/**
	 * Prints and returns the person's age
	 * @return
	 */
	public int PrintAge() {
		Calendar today = Calendar.getInstance();

		int age = 0;
		System.out.println(this.getDOB().getTime());
		if (this.getDOB().after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - this.getDOB().get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((this.getDOB().get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (this.getDOB().get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((this.getDOB().get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (this.getDOB().get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}
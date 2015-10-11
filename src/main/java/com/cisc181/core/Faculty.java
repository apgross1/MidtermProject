package com.cisc181.core;

import java.util.Calendar;


public class Faculty extends Employee {

	private String officeHours;
	private int rank;

    /**
     * Sets the office hours of the faculty member
     * @param officeHours
     */
    public void setofficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    /**
     * Returns the office hours of the faculty member
     * @return
     */
    public String getofficeHours(){
        return this.officeHours;
    }
    
    /**
     * Sets the rank of the faculty member
     * @param rank
     */
    public void setrank(int rank){
        this.rank = rank;
    }

    /**
     * Returns the rank of the faculty member
     * @return
     */
    public int getrank(){
        return this.rank;
    }    
    
	/**
	 * Overloaded constructor for Faculty
	 * @param FirstName
	 * @param MiddleName
	 * @param LastName
	 * @param DOB
	 * @param Address
	 * @param Phone_number
	 * @param Email
	 * @param officeHours
	 * @param rank
	 * @param salary
	 * @param hireDate
	 * @throws PersonException
	 */
	public Faculty(String FirstName, String MiddleName, String LastName,
			Calendar DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Calendar hireDate) throws PersonException 
	
	{
		//Call the Employee overloaded constructor
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate); 
		
		this.officeHours = officeHours;
		this.rank = rank;
	}

}
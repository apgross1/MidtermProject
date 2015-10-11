package com.cisc181.core;

import java.util.Calendar;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 private eTitle Title;
	 	
	 public Staff() {
		 
	 }
	   public Staff(eTitle title){
		   this.setTitle(title);
	    }

	    public void setTitle(eTitle title){
	        this.Title = title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    

    
	/**
	 * Overloaded constructor of Staff
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
	 * @param Title
	 * @throws PersonException
	 */
	public Staff(String FirstName, String MiddleName, String LastName,
			Calendar DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Calendar hireDate,
			eTitle Title) throws PersonException 
	
	{
		//Calls Employee's overloaded constructor
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.setTitle(Title);
	}

}
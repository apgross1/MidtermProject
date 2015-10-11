package com.cisc181.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID studentID;
	private ArrayList<Enrollment> schedule = new ArrayList<Enrollment>();
	
	/**
	 * Returns the student's major
	 * @return
	 */
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    
	/**
	 * Sets the student's major
	 * @param Major
	 */
	public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
	/**
	 * Overloaded constructor for Student
	 * @param FirstName
	 * @param MiddleName
	 * @param LastName
	 * @param DOB
	 * @param Major
	 * @param Address
	 * @param Phone_number
	 * @param Email
	 * @throws PersonException
	 */
	public Student(String FirstName, String MiddleName, String LastName, Calendar DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException 
	{
		//Calls Person's overloaded constructor
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.setMajor(Major);
		this.setStudentID();
		
	}
	

	/* (non-Javadoc)
	 * @see com.cisc181.core.Person#PrintName()
	 */
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	/**
	 * Prints student's name
	 * @param bnormal
	 */
	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	
	/**
	 * Return Student's ID
	 * @return
	 */
	public UUID getStudentID() {
		return studentID;
	}
	
	/**
	 * Sets student's ID
	 */
	public void setStudentID() {
		this.studentID = UUID.randomUUID();
	}
	
	/**
	 * Returns an array list of the student's class enrollments
	 * @return
	 */
	public ArrayList<Enrollment> getSchedule() {
		return schedule;
	}
	
	/**
	 * Sets an array list of the student's class enrollments
	 * @param oneClass
	 */
	public void setSchedule(Enrollment oneClass) {
		this.schedule.add(oneClass);
	}
}
package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID studentID;
	private ArrayList<Enrollment> schedule = new ArrayList<Enrollment>();
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.setMajor(Major);
		this.setStudentID();
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	public UUID getStudentID() {
		return studentID;
	}
	public void setStudentID() {
		this.studentID = UUID.randomUUID();
	}
	public ArrayList<Enrollment> getSchedule() {
		return schedule;
	}
	public void setSchedule(Enrollment oneClass) {
		this.schedule.add(oneClass);
	}
}
package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	private ArrayList<Course> Course = new ArrayList<Course>();
	
	public Semester() {
		
	}
	
	public Semester(Date startDate, Date endDate) {
		this.setSemesterID(UUID.randomUUID());
		this.setStartDate(startDate);
		this.setEndDate(endDate);
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public ArrayList<Course> getCourse() {
		return Course;
	}

	public void setCourse(Course course) {
		Course.add(course);
	}
}

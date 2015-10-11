package com.cisc181.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Calendar StartDate;
	private Calendar EndDate;
	private ArrayList<Course> Course = new ArrayList<Course>();
	
	/**
	 * No args constructor of Semester
	 */
	public Semester() {
		
	}
	
	/**
	 * Overloaded constructor for Semester
	 * @param startDate
	 * @param endDate
	 */
	public Semester(Calendar startDate, Calendar endDate) {
		this.setSemesterID(UUID.randomUUID());
		this.setStartDate(startDate);
		this.setEndDate(endDate);
	}
	
	/**
	 * Returns the Semester ID
	 * @return
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}
	
	/**
	 * Sets the Semester ID
	 * @param semesterID
	 */
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	
	/**
	 * Returns the starting date of the semester
	 * @return
	 */
	public Calendar getStartDate() {
		return StartDate;
	}
	
	/**
	 * Sets the start date of the Semester
	 * @param startDate
	 */
	public void setStartDate(Calendar startDate) {
		StartDate = startDate;
	}
	
	/**
	 * Returns the end date of the semester
	 * @return
	 */
	public Calendar getEndDate() {
		return EndDate;
	}
	
	/**
	 * Sets the end date of the semester
	 * @param endDate
	 */
	public void setEndDate(Calendar endDate) {
		EndDate = endDate;
	}

	/**
	 * Returns an array list of the courses available in the semester
	 * @return
	 */
	public ArrayList<Course> getCourse() {
		return Course;
	}

	/**
	 * Sets and array list of ourses available in the semester
	 * @param course
	 */
	public void setCourse(Course course) {
		Course.add(course);
	}
}

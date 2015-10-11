package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private UUID CourseID;
	private double Grade;

	
	private Enrollment() {
			
	}
	
	public Enrollment(UUID StudentID, UUID SectionID, UUID CourseID) {
		this.setSectionID(SectionID);
		this.setStudentID(StudentID);
		//WHAT'S EnrollmentID?
		this.setEnrollmentID(UUID.randomUUID());
		this.setCourseID(CourseID);
	}
	

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		this.EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	public void setCourseID(UUID courseid) {
		this.CourseID = courseid;
	}
	
	public UUID getCourseID() {
		return this.CourseID;
	}
}

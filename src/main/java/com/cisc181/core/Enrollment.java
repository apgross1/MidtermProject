package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;


public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private UUID CourseID;
	private double Grade;

	
	/**
	 * Private no-arg constructor for enrollment
	 */
	private Enrollment() {
			
	}
	
	/**
	 * Overloaded constructor for Enrollment
	 * @param StudentID
	 * @param SectionID
	 * @param CourseID
	 */
	public Enrollment(UUID StudentID, UUID SectionID, UUID CourseID) {
		this.setSectionID(SectionID);
		this.setStudentID(StudentID);
		this.setEnrollmentID(UUID.randomUUID());
		this.setCourseID(CourseID);
	}
	

	/**
	 * Returns the SectionID under which the enrollment resides
	 * @return
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * Sets the Section ID under which the enrollment resides
	 * @param sectionID
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	/**
	 * Returns the StudentID of the student who is enrolled
	 * @return
	 */
	public UUID getStudentID() {
		return StudentID;
	}

	/**
	 * Sets the StudentID of the student who is enrolled
	 * @param studentID
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	/**
	 * Returns the EnrollmentID
	 * @return
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	/**
	 * Sets the Enrollment ID
	 * @param enrollmentID
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		this.EnrollmentID = enrollmentID;
	}

	/**
	 * Returns the grade of the student enrolled
	 * @return
	 */
	public double getGrade() {
		return Grade;
	}

	/**
	 * Sets the grade of the student enrolled
	 * @param grade
	 */
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	/**
	 * Sets the CourseID under which the student is enrolled
	 * @param courseid
	 */
	public void setCourseID(UUID courseid) {
		this.CourseID = courseid;
	}
	
	/**
	 * Returns the CourseID under which the student is enrolled
	 * @return
	 */
	public UUID getCourseID() {
		return this.CourseID;
	}
}

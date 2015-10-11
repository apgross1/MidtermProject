package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	private ArrayList<Section> Section = new ArrayList<Section>();

	
	/**
	 * Public no args constructor for Course
	 */
	public Course() {
		
	}

	/**
	 * Overloaded constructor for Course
	 * @param courseName
	 * @param gradePoints
	 * @param major
	 */
	public Course(String courseName, int gradePoints, eMajor major) {
		this.setCourseID(UUID.randomUUID());
		this.setCourseName(courseName);
		this.setGradePoints(gradePoints);
		this.setMajor(major);
		
	}

	/**
	 * Getter for Course ID
	 * @return
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * Setter for Course ID
	 * @param courseID
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	/**
	 * Returns the name of the Course
	 * @return
	 */
	public String getCourseName() {
		return CourseName;
	}

	/**
	 * Sets the name of the Course
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	/**
	 * Returns the grade points of the course
	 * @return
	 */
	public int getGradePoints() {
		return GradePoints;
	}

	/**
	 * Sets the grade points of the course
	 * @param gradePoints
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	/**
	 * Returns the major under which the course is found
	 * @return
	 */
	public eMajor getMajor() {
		return Major;
	}

	/**
	 * Sets the major under which the course is found
	 * @param major
	 */
	public void setMajor(eMajor major) {
		Major = major;
	}

	/**
	 * Returns the list of sections for the course
	 * @return
	 */
	public ArrayList<Section> getSection() {
		return Section;
	}

	/**
	 * Sets the list of sections for the course (2 per course)
	 * @param section
	 */
	public void setSection(Section section) {
		Section.add(section);
	}
}

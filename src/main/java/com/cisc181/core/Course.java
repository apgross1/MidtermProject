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

	
	public Course() {
		
	}

	public Course(String courseName, int gradePoints, eMajor major) {
		this.setCourseID(UUID.randomUUID());
		this.setCourseName(courseName);
		this.setGradePoints(gradePoints);
		this.setMajor(major);
		
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}

	public ArrayList<Section> getSection() {
		return Section;
	}

	public void setSection(Section section) {
		Section.add(section);
	}
}

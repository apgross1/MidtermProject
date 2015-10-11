package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	private ArrayList<Enrollment> roster = new ArrayList<Enrollment>();
	
	/**
	 * No args constructor for Section
	 */
	public Section() {
		this.setSectionID();
	}

	/**
	 * Sets the Course ID
	 * @param courseID
	 */
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}

	/**
	 * Sets the Semester ID
	 * @param semester
	 */
	public void setSemesterID(UUID semester) {
		SemesterID = semester;
	}
	
	/**
	 * Returns the section ID
	 * @return
	 */
	public UUID getSectionID() {
		return SectionID;
	}
	
	/**
	 * Sets the section ID
	 */
	public void setSectionID() {
		SectionID = UUID.randomUUID();
	}
	
	/**
	 * Returns the Room ID
	 * @return
	 */
	public int getRoomID() {
		return RoomID;
	}
	
	/**
	 * Sets the Room ID
	 * @param roomID
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	/**
	 * Returns a roster (ArrayList of student enrollments) of the section
	 * @return
	 */
	public ArrayList<Enrollment> getRoster() {
		return roster;
	}

	/**
	 * Sets the section's roster
	 * @param student
	 */
	public void setRoster(Enrollment student) {
		this.roster.add(student);
	}
}

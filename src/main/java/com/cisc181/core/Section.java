package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	private ArrayList<Enrollment> roster = new ArrayList<Enrollment>();
	
	public Section() {
		this.setSectionID();
	}

	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}

	public void setSemesterID(UUID semester) {
		SemesterID = semester;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID() {
		SectionID = UUID.randomUUID();
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public ArrayList<Enrollment> getRoster() {
		return roster;
	}

	public void setRoster(Enrollment student) {
		this.roster.add(student);
	}


	

}

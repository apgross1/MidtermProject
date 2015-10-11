package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Student> studentlist;
	private static ArrayList<Semester> semesterlist;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Creating 2 semesters
		Semester fall = new Semester();
		Semester spring = new Semester();
		ArrayList<Semester> semesterList = new ArrayList<Semester>();
		semesterList.add(fall);
		semesterList.add(spring);
		
		//Creating a list of students
		ArrayList<Student> studentList = new ArrayList<Student>();
		Calendar dob = Calendar.getInstance();
		dob.set(1996, 3, 12);
		Student student1 = new Student("John", "S.", "Smith", dob, eMajor.BUSINESS, "129 Marble Dr.", "(302)-888-9834",
				"jsmith@udel.edu");
		studentList.add(student1);
		Student student2 = new Student("Abby", "R.", "Gallard", dob, eMajor.CHEM, "8th Street", "(302)-473-9334",
				"agallard@udel.edu");
		studentList.add(student2);
		Student student3 = new Student("Rolf", "W.", "Heimler", dob, eMajor.NURSING, "9th and Willow st.",
				"(584)-822-2223", "rheimler@udel.edu");
		studentList.add(student3);
		Student student4 = new Student("Jose", "A.", "Ramirez", dob, eMajor.PHYSICS, "29 Walnut Dr.", "(302)-122-9123",
				"jramirez@udel.edu");
		studentList.add(student4);
		Student student5 = new Student("Hao", "Y.", "Sun", dob, eMajor.BUSINESS, "399 Yew Ave.", "(308)-828-1233",
				"hsun@udel.edu");
		studentList.add(student5);
		Student student6 = new Student("Sanjeev", "J.", "Gupta", dob, eMajor.BUSINESS, "912 Birch Loop",
				"(302)-822-0129", "sgupta@udel.edu");
		studentList.add(student6);
		Student student7 = new Student("Abdul", "Z.", "Sharif", dob, eMajor.BUSINESS, "274 Oak Dr.", "(302)-192-1298",
				"asharif@udel.edu");
		studentList.add(student7);
		Student student8 = new Student("Jesus", "R.", "Martinez", dob, eMajor.COMPSI, "372 Maple Blvd.",
				"(302)-219-2190", "jmartinez@udel.edu");
		studentList.add(student8);
		Student student9 = new Student("Charles", "M.", "Moore", dob, eMajor.BUSINESS, "202 Cork Cr.", "(302)-328-1223",
				"cmoore@udel.edu");
		studentList.add(student9);
		Student student10 = new Student("Josefina", "V.", "Prado", dob, eMajor.COMPSI, "292 Arbol Ave.",
				"(302)-029-1029", "jprado@udel.edu");
		studentList.add(student10);
		studentlist = studentList;
		semesterlist = semesterList;

		//Adding 3 courses to each semester
		for (Semester s : semesterlist) {
			Course course1 = new Course("BIO-122", 20, eMajor.NURSING);
			Course course2 = new Course("CHEM-225", 40, eMajor.CHEM);
			Course course3 = new Course("ECON-306", 70, eMajor.BUSINESS);
			s.setCourse(course1);
			s.setCourse(course2);
			s.setCourse(course3);
		}

	//Adding 2 sections to each course
	int i = 0;
	while(i<2) {
		for (Course c : semesterlist.get(i).getCourse()) {
			Section section1 = new Section();
			Section section2 = new Section();
			section1.setSectionID();
			section2.setSectionID();
			section1.setSemesterID(semesterlist.get(0).getSemesterID());
			section1.setCourseID(c.getCourseID());
			section2.setSemesterID(semesterlist.get(0).getSemesterID());
			section2.setCourseID(c.getCourseID());
			c.setSection(section1);
			c.setSection(section2);
			
			//Adding list of students to each section
			for (Section sec: c.getSection()) {
				for (Student stu : studentlist) {
					Enrollment enrollment = new Enrollment(stu.getStudentID(), sec.getSectionID(), c.getCourseID());
					sec.setRoster(enrollment);
					stu.setSchedule(enrollment);
					enrollment.setGrade(Math.random() * 4);
				}
			}
		}
		i += 1;
	}

}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests if there are 10 students in each section and each section contains instances of Student
	 * @throws Exception
	 */
	@Test
	public void enrollStudents() throws Exception {
		// Test to see if each section has 10 students enrolled.
		//Semester 1
		//	Course 1
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(0).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(0).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(0).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(0).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//	Course 2
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(1).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(1).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(1).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(1).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//	Course 3
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(2).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(2).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(0).getCourse().get(2).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(0).getCourse().get(2).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//Semester 2
		//	Course 1
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(0).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(0).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(0).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(0).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//	Course 2
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(1).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(1).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(1).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(1).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//	Course 3
		//		Section 1
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(2).getSection().get(0).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(2).getSection().get(0).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		//		Section 2
		assertTrue("There are not 10 students in the classs", semesterlist.get(1).getCourse().get(2).getSection().get(1).getRoster().size() == 10);
		assertTrue("Does not contain instances of Student", semesterlist.get(1).getCourse().get(2).getSection().get(1).getRoster().get(0).getStudentID() == studentlist.get(0).getStudentID());
		
	}
	
	/**
	 * Test to calculate GPA for each of the 10 students
	 * @throws Exception
	 */
	@Test
	public void gpaTest() throws Exception {
		for (Student stu : studentlist) {
			double pointaccum = 0;
			for (Enrollment e : stu.getSchedule()) {
				pointaccum += e.getGrade();
			}
			double gpa = pointaccum/stu.getSchedule().size();
			double total = (stu.getSchedule().get(0).getGrade() + stu.getSchedule().get(1).getGrade() +
					stu.getSchedule().get(2).getGrade() + stu.getSchedule().get(3).getGrade() +
					stu.getSchedule().get(4).getGrade() + stu.getSchedule().get(5).getGrade() +
					stu.getSchedule().get(6).getGrade() + stu.getSchedule().get(7).getGrade() +
					stu.getSchedule().get(8).getGrade() + stu.getSchedule().get(9).getGrade() +
					stu.getSchedule().get(10).getGrade() + stu.getSchedule().get(11).getGrade());
			double gpaLong = total/12;
			System.out.printf(stu.getFirstName() + " " + stu.getLastName() + "'s GPA tested and is %.2f out of 4.0 %n", gpa );
			assertEquals(gpa, gpaLong, .02 );
			
		}
	}
	
	/**
	 * Test to calculate the average grade per course per semester
	 * @throws Exception
	 */
	@Test
	public void averageGradeTest() throws Exception {
		for (Semester s : semesterlist) {
			for (Course c : s.getCourse()) {
				double totalPoints = 0;
				for (Section sec : c.getSection()) {
					for(Enrollment enroll : sec.getRoster()) {
						totalPoints += enroll.getGrade();
					}
				}
				double avgGrade = totalPoints/20;
				double gradeLong = 0;
				for (Student stu : studentlist) {
					for (int i = 0; i < 12; i ++) {
						if (c.getCourseID() == stu.getSchedule().get(i).getCourseID()) {
							gradeLong += stu.getSchedule().get(i).getGrade();
						}
						else
							continue;
					}
				}
				double avgLong = gradeLong/20;
				System.out.printf("The average grade of " + c.getCourseName() + " is %.2f out of 4.00 %n", avgGrade);
				assertEquals(avgGrade, avgLong, .01);
			}
		}
	}
	
	/**
	 * Test to change the major of a student
	 * @throws Exception
	 */
	@Test
	public void changeMajor() throws Exception {
		System.out.println("Intital major: " + studentlist.get(0).getMajor());
		assertFalse("The majors are the same", studentlist.get(0).getMajor() == eMajor.COMPSI);
		System.out.println("Changing the major to Computer Science...");
		studentlist.get(0).setMajor(eMajor.COMPSI);
		System.out.println("The student's major is now " + studentlist.get(0).getMajor());
		assertTrue("Majors are not the same", studentlist.get(0).getMajor() == eMajor.COMPSI);
	}
}

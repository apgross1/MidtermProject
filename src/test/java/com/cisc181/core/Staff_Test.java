package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	@Test
	public void salaryTest() {
		ArrayList<Staff> staff_list = new ArrayList<Staff>();
		Staff staff1 = new Staff();
		staff1.setSalary(25000.00);
		staff_list.add(staff1);
		Staff staff2 =  new Staff();
		staff2.setSalary(40000.00);
		staff_list.add(staff2);
		Staff staff3 = new Staff();
		staff3.setSalary(36000.00);
		staff_list.add(staff3);
		Staff staff4 = new Staff();
		staff4.setSalary(89500.00);
		staff_list.add(staff4);
		Staff staff5 = new Staff();
		staff5.setSalary(109500.00);
		staff_list.add(staff5);
		
		double sum = 0.00;
		for (Staff e : staff_list) {
			sum += e.getSalary();
		}	
		
		double avgSalary = (sum)/(staff_list.size());
		assertEquals(avgSalary, 60000.00, .5);
			
	}
	
	@Test
	public void exceptionTestDOB() throws PersonException { 
		//Invalid date of birth
		Date dateOfBirth = new Date();
		//Deprecated...should we use Calendar?
		dateOfBirth.setDate(15);
		dateOfBirth.setMonth(2);
		dateOfBirth.setYear(1914);
		Date hireDate = new Date();
		hireDate.setDate(25);
		hireDate.setMonth(7);
		hireDate.setYear(2003);
		try{
			Staff staff = new Staff("Joseph", "Brian", "Smith", dateOfBirth,
					"109 Willow Rd", "(302)-967-3902", "jspe@udel.edu", 
					"2:00PM to 3:00PM", 23, 45000.00, hireDate, eTitle.MAINTENANCE_HEAD);
		}catch(PersonException p) {
			System.out.println("PersonExcepton was thrown");
		}
		finally{
			System.out.println("Birth date error test complete");
		}
		
	}
	
	@Test
	public void exceptionTestPhoneNum() throws PersonException {
		//Invalid phone number format
		Date dateOfBirth = new Date();
		//Deprecated...should we use Calendar?
		dateOfBirth.setDate(15);
		dateOfBirth.setMonth(2);
		dateOfBirth.setYear(1956);
		Date hireDate = new Date();
		hireDate.setDate(25);
		hireDate.setMonth(7);
		hireDate.setYear(2003);
		try{
			Staff staff = new Staff("Joseph", "Brian", "Smith", dateOfBirth,
					"109 Willow Rd", "11-22-333", "jspe@udel.edu", 
					"2:00PM to 3:00PM", 23, 45000.00, hireDate, eTitle.MAINTENANCE_HEAD);
		}catch(PersonException p) {
			System.out.println("PersonExcepton was thrown");
		}
		finally{
			System.out.println("Phone number error test complete");
		}
	}
}

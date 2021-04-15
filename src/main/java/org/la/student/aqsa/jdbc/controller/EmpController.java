package org.la.student.aqsa.jdbc.controller;

import java.sql.Date;
import java.util.List;
import org.la.student.aqsa.jdbc.model.Employee;
import org.la.student.aqsa.jdbc.service.EmpService;


public class EmpController {

	EmpService empService = null;
	
	public EmpController() {
		empService = new EmpService();
	}
	
	public static void main(String[] args) {
		
		EmpController empControl = new EmpController();
		empControl.addEmployee();
		
		//empControl.findById(1);
		
	//empControl.findByName("khan");
		
	//	Date fromDate = Date.valueOf("1980-01-01");
	//	Date toDate = Date.valueOf("1997-12-30");
	//	empControl.findByAge(fromDate, toDate);
		
	}
	
	public void findByAge(Date fromDobDate, Date toDobDate){
		
		System.out.println("----------findbydob fromdate to todate employee---------------");
		
		List<Employee> employeeList = empService.findByAge(fromDobDate, toDobDate);
		System.out.println(employeeList);
	}
	
	void findById(int id) {
		System.out.println("----------findbyid employee---------------");
		
		Employee employee = empService.findById(id);
		System.out.println("Employee: "+employee);
	}
	
	void findByName(String name) {
		
		System.out.println("----------findbyname employee---------------");
		
		List<Employee> empList = empService.findByName(name);
		
		System.out.println(empList);
	}

	void addEmployee() {

		System.out.println("----------Adding employee---------------");
		Employee employee = new Employee();
		employee.setName("khan");
		Date dob = Date.valueOf("1987-10-11");
		employee.setDob(dob);
		employee.setEmailId("fama@mail.com");
		employee.setGender("male");
		dob = Date.valueOf("2016-1-28");
		employee.setJoinedDate(dob);
		dob = Date.valueOf("2019-4-18");
		employee.setReleaseDate(dob);
		employee.setNoticePeriod(45);
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
		
		empService.create(employee);
		
	}
}	
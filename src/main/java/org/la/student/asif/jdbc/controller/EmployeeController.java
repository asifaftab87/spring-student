package org.la.student.asif.jdbc.controller;

import java.sql.Date;
import java.util.List;

import org.la.student.asif.jdbc.model.Employee;
import org.la.student.asif.jdbc.service.EmployeeService;

public class EmployeeController {

	EmployeeService empService = null;
	
	public EmployeeController() {
		empService = new EmployeeService();
	}
	
	public void findAll(){
		List<Employee> empList = empService.findAll();
		empList.stream().forEach(s -> System.out.println(s));
	}
	
	public static void main(String[] args) {
		
		EmployeeController empControl = new EmployeeController();
		//empControl.addEmployee();
		//empControl.findAll();
		//empControl.addEmployee();
		
		//empControl.findById(1);
		
		empControl.findByName("asif");
		
		//Date fromDate = Date.valueOf("1980-01-01");
		//Date toDate = Date.valueOf("1997-12-30");
		//empControl.findByAge(fromDate, toDate);
		
	}
	
	public void findByAge(Date fromDobDate, Date toDobDate){
		
		System.out.println("----------findbydob fromdate to todate employee---------------");
		
		List<Employee> employeeList = empService.findByAge(fromDobDate, toDobDate);
		System.out.println(employeeList);
	}
	
	void findById(int id) {
		System.out.println("----------findbyid employee---------------");
		
		Employee employee = empService.findById(id);
		if(employee==null) {
			System.out.println("employee not found");
		}
		else {
			System.out.println("Employee: "+employee);
		}
	}
	
	void findByName(String name) {
		
		System.out.println("----------findbyname employee---------------");
		
		List<Employee> empList = empService.findByName(name);
		
		System.out.println(empList);
	}

	void addEmployee() {

		System.out.println("----------Adding employee---------------");
		
		Employee employee = new Employee();
		
		employee.setName("alam");
		Date dob = Date.valueOf("1987-05-11");
		employee.setDob(dob);
		employee.setEmailId("alam@mail.com");
		employee.setGender("male");
		dob = Date.valueOf("2019-01-18");
		employee.setJoinedDate(dob);
		dob = Date.valueOf("2011-07-28");
		employee.setReleaseDate(dob);
		employee.setNoticePeriod(15);
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
		employee.setAge(84);
		
		empService.create(employee);
		
	}
	
	
}
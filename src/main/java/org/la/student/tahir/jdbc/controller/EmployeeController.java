package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.Employee;
import org.la.student.tahir.jdbc.service.EmployeeService;

public class EmployeeController {

	EmployeeService empService = null;
	
	EmployeeController(){
		
		empService = new EmployeeService();
	}
	
	public static void main(String[] args) {
		
	
		EmployeeController empCntrl= new EmployeeController();
		empCntrl.addEmployee();
	}
	
	void findAll(){
		
		List<Employee> empList = EmployeeService.findAll();
		
		System.out.println(empList);
	}
		
	void findById (int id){
		
		Employee employee = EmployeeService.findById(id);
		System.out.println(employee);
	}
	
	void findByCityId(int cityId){
		
		List<Employee> empList = EmployeeService.findByCityId(cityId);
		System.out.println(empList);
	}
	
	void findByEmployeeNum(int employeeNum){
		
		List<Employee> empList = EmployeeService.findByEmployeeNum(employeeNum);
		System.out.println(empList);
		
	}
	
	public static void create(Employee employee) {
		
		EmployeeService.create(employee);
	}
	
	void addEmployee() {
		
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setCityId(11);
		emp.setEmployeeNum(21);
		emp.setEmployeeName("Tahir");
		emp.setDateHired("01-July-2021");
		
		EmployeeService.create(emp);
		//empService.create(emp);
	}
}

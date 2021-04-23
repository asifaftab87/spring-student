package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.Employee;

import org.la.student.tahir.jdbc.repository.EmployeeRepository;

public class EmployeeService {

	public EmployeeService(){
		
		EmployeeRepository.connectionOpen();
		
	}
	
	public static List<Employee> findAll(){
		
		List<Employee> empList = EmployeeRepository.findAll();
		
		return empList;
	}
	

	public static Employee findById(int id){
		
		return EmployeeRepository.findById(id);
	}
	
	public static List<Employee> findByCityId(int cityId){
		
		List<Employee> empList = EmployeeRepository.findByCityId(cityId);
		
		return empList;
	}
	
	public static List<Employee> findByEmployeeNum(int employeeNum){
		
		return EmployeeRepository.findByEmployeeNum(employeeNum);
	}
	
	public static void create(Employee employee) {
		
		EmployeeRepository.create(employee);
	}
	
	public static void update() {
		
		EmployeeRepository.update();
		
		Employee employee = new Employee();
		
		employee.getId();
		employee.getCityId();
		employee.getEmployeeNum();
		employee.getEmployeeName();
		employee.getDateHired();
	}
	
}

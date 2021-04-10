package org.la.student.asif.jdbc.service;

import java.sql.Date;
import java.util.List;

import org.la.student.asif.jdbc.model.Employee;
import org.la.student.asif.jdbc.repository.EmployeeRepository;

public class EmployeeService {
	
	public EmployeeService() {
		EmployeeRepository.connectionOpen();
	}
	
	public List<Employee> findAll(){
		List<Employee> empList = EmployeeRepository.findAll();
		return empList;
	}
	
	public List<Employee> findByName(String name){
		List<Employee> empList = EmployeeRepository.findByName(name);
		return empList;
	}
	
	public List<Employee> findByAge(Date fromDobDate, Date toDobDate){
		return null;//EmpRepository.findById(id);
	}
	
	public Employee findById(int id){
		return EmployeeRepository.findById(id);
	}
	
	public Employee findByEmailId(String emailId) {
		return EmployeeRepository.findByEmailId(emailId);
	}
	public List<Employee> findByDob(Date fromDobDate, Date toDobDate){
		return EmployeeRepository.findByDob(fromDobDate, toDobDate);
	}
	
	public List<Employee> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return EmployeeRepository.findByJoinedDate(fromJoinedDate, toJoinedDate);
	}
	
	public List<Employee> findByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return EmployeeRepository.findByReleaseDate(fromReleaseDate, toReleaseDate);
	}
	
	public List<Employee> findByNoticePeriod(int noticePeriod){
		return EmployeeRepository.findByNoticePeriod(noticePeriod);
	}
	
	public List<Employee> findByGender(String gender){
		return EmployeeRepository.findByGender(gender);
	}
	
	
	public void create(Employee employee) {
		
		EmployeeRepository.create(employee);
	}
	
	public static void update() {
		EmployeeRepository.update();
		Employee employee = new Employee();
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
	}
}
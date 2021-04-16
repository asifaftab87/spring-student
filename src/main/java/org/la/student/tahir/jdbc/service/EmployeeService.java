package org.la.student.tahir.jdbc.service;

import java.sql.Date;
import java.util.List;

import org.la.student.tahir.jdbc.model.Employee1;
import org.la.student.tahir.jdbc.repository.EmployeeRepository;

public class EmployeeService {


	public EmployeeService() {
		EmployeeRepository.connectionOpen();
	}
	
	public List<Employee1> findAll(){
		List<Employee1> empList = EmployeeRepository.findAll();
		return empList;
	}
	
	public List<Employee1> findByName(String name){
		List<Employee1> empList = EmployeeRepository.findByName(name);
		return empList;
	}
	
	public List<Employee1> findByAge(Date fromDobDate, Date toDobDate){
		return null;//EmpRepository.findById(id);
	}
	
	public Employee1 findById(int id){
		return EmployeeRepository.findById(id);
	}
	
	public Employee1 findByEmailId(String emailId) {
		return EmployeeRepository.findByEmailId(emailId);
	}
	public List<Employee1> findByDob(Date fromDobDate, Date toDobDate){
		return EmployeeRepository.findByDob(fromDobDate, toDobDate);
	}
	
	public List<Employee1> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return EmployeeRepository.findByJoinedDate(fromJoinedDate, toJoinedDate);
	}
	
	public List<Employee1> findByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return EmployeeRepository.findByReleaseDate(fromReleaseDate, toReleaseDate);
	}
	
	public List<Employee1> findByNoticePeriod(int noticePeriod){
		return EmployeeRepository.findByNoticePeriod(noticePeriod);
	}
	
	public List<Employee1> findByGender(String gender){
		return EmployeeRepository.findByGender(gender);
	}
	
	
	public void create(Employee1 employee) {
		
		EmployeeRepository.create(employee);
	}
	
	public static void update() {
		EmployeeRepository.update();
		Employee1 employee = new Employee1();
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
	}
}

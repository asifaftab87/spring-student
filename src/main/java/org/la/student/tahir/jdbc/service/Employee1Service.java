package org.la.student.tahir.jdbc.service;

import java.sql.Date;
import java.util.List;

import org.la.student.tahir.jdbc.model.Employee1;
import org.la.student.tahir.jdbc.repository.Employee1Repository;

public class Employee1Service {


	public Employee1Service() {
		Employee1Repository.connectionOpen();
	}
	
	public List<Employee1> findAll(){
		List<Employee1> empList = Employee1Repository.findAll();
		return empList;
	}
	
	public List<Employee1> findByName(String name){
		List<Employee1> empList = Employee1Repository.findByName(name);
		return empList;
	}
	
	public List<Employee1> findByAge(Date fromDobDate, Date toDobDate){
		return null;//EmpRepository.findById(id);
	}
	
	public Employee1 findById(int id){
		return Employee1Repository.findById(id);
	}
	
	public Employee1 findByEmailId(String emailId) {
		return Employee1Repository.findByEmailId(emailId);
	}
	public List<Employee1> findByDob(Date fromDobDate, Date toDobDate){
		return Employee1Repository.findByDob(fromDobDate, toDobDate);
	}
	
	public List<Employee1> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return Employee1Repository.findByJoinedDate(fromJoinedDate, toJoinedDate);
	}
	
	public List<Employee1> findByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return Employee1Repository.findByReleaseDate(fromReleaseDate, toReleaseDate);
	}
	
	public List<Employee1> findByNoticePeriod(int noticePeriod){
		return Employee1Repository.findByNoticePeriod(noticePeriod);
	}
	
	public List<Employee1> findByGender(String gender){
		return Employee1Repository.findByGender(gender);
	}
	
	
	public void create(Employee1 employee) {
		
		Employee1Repository.create(employee);
	}
	
	public static void update() {
		Employee1Repository.update();
		Employee1 employee = new Employee1();
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
	}
}

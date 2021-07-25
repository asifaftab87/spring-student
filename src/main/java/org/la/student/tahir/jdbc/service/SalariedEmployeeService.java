package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.SalariedEmployee;
import org.la.student.tahir.jdbc.repository.SalariedEmployeeRepository;

public class SalariedEmployeeService {
	
	public SalariedEmployeeService(){
		
		SalariedEmployeeRepository.connectionOpen();
	}

	
	public static List<SalariedEmployee> findAll(){
		
		List<SalariedEmployee> Slist =  SalariedEmployeeRepository.findAll();
		return Slist;
	}
	
	public static SalariedEmployee findById(int id){
		
		return SalariedEmployeeRepository.findById(id);
		
	}
	
	public static SalariedEmployee findByAnnualSalary(int annualSalary){
		
		return SalariedEmployeeRepository.findByAnnualSalary(annualSalary);
	}
	

public static SalariedEmployee findByEmployeeId(int employeeId){
	
	return SalariedEmployeeRepository.findByEmployeeId(employeeId);
}

public static void create(SalariedEmployee sEmployee) {
	
	SalariedEmployeeRepository.create(sEmployee);
}

public static void update() {
	
	SalariedEmployee sEmployee = new SalariedEmployee();
	
	sEmployee.getId();
	sEmployee.getAnnualSalary();
	sEmployee.getEmployeeId();
	
	
	
}


}

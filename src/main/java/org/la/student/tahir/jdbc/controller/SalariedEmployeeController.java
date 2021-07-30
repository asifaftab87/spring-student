package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.SalariedEmployee;
import org.la.student.tahir.jdbc.service.SalariedEmployeeService;

public class SalariedEmployeeController {

	
	SalariedEmployeeService SEService = null;
	
	SalariedEmployeeController(){
		
		SEService = new SalariedEmployeeService();
		
	}
	
	public static void main(String[] args) {
		
		
		SalariedEmployeeController sECntrl = new SalariedEmployeeController();
		
		sECntrl.addSEmployee();
		sECntrl.findAll();
	
	}
	
	void findAll() {
		
		List<SalariedEmployee> SElist = SalariedEmployeeService.findAll();
		
		System.out.println(SElist);
		
	}
	
	void findById(int id) {
		SalariedEmployee SEmp = SalariedEmployeeService.findById(id);
		
		System.out.println(SEmp);	
		
	}
	
	void findByAnnualSalary(int annualSalary) {
		
		SalariedEmployee SEmp = SalariedEmployeeService.findByAnnualSalary(annualSalary);
		
		System.out.println(SEmp);
	}
	
	void findByEmployeeId(int employeeId) {
		
		SalariedEmployee SEmp = SalariedEmployeeService.findByEmployeeId(employeeId);
		
		System.out.println(SEmp);
		
	}
	
	void addSEmployee(){
		
		SalariedEmployee SEmp = new SalariedEmployee();
		
		SEmp.setId(1);
		SEmp.setAnnualSalary(100000);
		SEmp.setEmployeeId(11);
		
		SalariedEmployeeService.create(SEmp);
	}
	
	
	
	
	

}

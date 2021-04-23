package org.la.student.tahir.jdbc.controller;


//import java.util.List;

import org.la.student.tahir.jdbc.model.Company;

//import org.la.student.tahir.jdbc.repository.CompanyRepository;
import org.la.student.tahir.jdbc.service.CompanyService;

public class CompanyController {
	
	//CompanyService comService = new CompanyService();
	//static Company company = new Company();
CompanyService comService = null;
	
	public CompanyController() {
		comService = new CompanyService();
	}
	
/*	
	public void findAll(){
		List<Company> empList = comService.findAll();
		empList.stream().forEach(s -> System.out.println(s));
	}*/
	
	public static void main(String[] args) {
		
		CompanyController comctrl = new CompanyController();
		

		comctrl.addCompany();
		//comctrl.findAll();
		//comctrl.findById(11);
	}
	
	void addCompany() {

		//System.out.println("----------Adding company---------------");
		
		
		
		Company company = new Company();
		
		company.setCompanyId(1);
		company.setName("GALAXY");
		company.setDescription("Construction");
		company.setPrimaryContactAttendeeId(234);
			
		
		//comService.create(company);
		comService.create(company);
		
		
	}
	
/*	
void findByName(String name) {
		
		System.out.println("----------findbyname employee---------------");
		
		List<Company> comList = comService.findByName(name);
		
		System.out.println(comList);
	}

void findByDescription(String description) {
	
	System.out.println("----------findbyDescription company---------------");
	
	List<Company> comList = comService.findByName(description);
	
	System.out.println(comList);
}



void findById(int companyId) {
	System.out.println("----------findbyid employee---------------");
	Company company = comService.findById(companyId);
	
	if(company==null) {
		System.out.println("company not found");
	}
	else {
		System.out.println("Company: "+company);
	}
}

void findByPrimaryContactAttendeeId(int primaryContactAttendeeId) {
	System.out.println("----------findByPrimaryContactAttendeeId company---------------");
	Company company = comService.findByPrimaryContactAttendeeId(primaryContactAttendeeId);
	
	if(company==null) {
		System.out.println("company not found");
	}
	else {
		System.out.println("Company: "+company);
		
		
	}
}
*/

}


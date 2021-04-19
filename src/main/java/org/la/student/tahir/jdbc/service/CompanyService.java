package org.la.student.tahir.jdbc.service;

import java.util.List;


import org.la.student.tahir.jdbc.model.Company;
import org.la.student.tahir.jdbc.repository.CityRepository;
import org.la.student.tahir.jdbc.repository.CompanyRepository;

public class CompanyService {

	
public CompanyService() {
		
		CityRepository.connectionOpen();
	}
	
	public List<Company> findAll(){
		List<Company> comList = CompanyRepository.findAll();
		return comList;
	}
	
	public List<Company> findByName(String name){
		List<Company> comList = CompanyRepository.findByName(name);
		return comList;
	}
	
	public Company findById(int companyId){
	return CompanyRepository.findById(companyId);
		
	}
	
	public List<Company> findDescription(String description){
		List<Company> comList = CompanyRepository.findByDescription(description);
		return comList;
	}
	
	
	public Company findByPrimaryContactAttendeeId(int primaryContactAttendeeId){
		return CompanyRepository.findByPrimaryContactAttendeeId(primaryContactAttendeeId);
		
	}
	
	
	

	public void create(Company company) {
		CompanyRepository.create(company);
		
	}
	
	public static void update() {
		
		CompanyRepository.update();
		
		Company company = new Company();
		company.getCompanyId();
		company.getName();
		company.getDescription();
		company.getPrimaryContactAttendeeId();
		
		
		
	}
}

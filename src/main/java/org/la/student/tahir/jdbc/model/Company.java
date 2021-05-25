package org.la.student.tahir.jdbc.model;

import java.io.Serializable;


public class Company implements Serializable {

	private static final long serialVersionUID = -8545901547885450379L;
	
	private int companyId, primaryContactAttendeeId;
	private String name, description;
	
	
	public int getCompanyId() {
		
		return companyId;
	}
	
	public void setCompanyId(int companyId) {
		
		this.companyId = companyId;
	}
	
	public int getPrimaryContactAttendeeId() {
		
		return primaryContactAttendeeId;
	}
	
	public void setPrimaryContactAttendeeId(int primaryContactAttendeeId) {
		
		this.primaryContactAttendeeId = primaryContactAttendeeId;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	public String toString() {
		
		return "companyId:"+companyId +"  PrimaryContactAttendeeId:" +primaryContactAttendeeId + name + description;
	}
}

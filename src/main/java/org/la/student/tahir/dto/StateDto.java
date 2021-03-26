package org.la.student.tahir.dto;

public class StateDto {

	private String name;
	private int stateId, countryId, stateCode;
	
	public String getName() {
		
		return name;
	}
	
	public void setName( String name) {
		
		this.name = name;
	}
	
	
	public int getStateId() {
		
		return stateId;
	}
	
	public void setStateId( int stateId) {
		
		this.stateId = stateId;
	}
	
	public int getCountryId() {
		
		return countryId;
	}
	
	public void setCountryId( int countryId) {
		
		this.countryId = countryId;
	}
	
	public int getStateCode() {
		
		return stateCode;
	}
	
	public void setStateCode( int stateCode) {
		
		this.stateCode = stateCode;
	}
	
	public String toString() {
		
		return "Name:" + name + " StateId:" + stateId + " CountryId:" + countryId + " StateCode:" + stateCode;
	}
}

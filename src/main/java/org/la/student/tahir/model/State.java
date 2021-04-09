package org.la.student.tahir.model;

public class State {
	
	/*create a model class State having fields stateId, countryId, name, stateCode
create a dto class StateDto having fields stateId, countryId, name, stateCode
copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/
	
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
	
	

}

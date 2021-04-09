package org.la.student.tahir.model;

public class Street {
	
	/*create a model class Street having fields streetId, cityId, countryId, stateId, name, address, postcode
	create a dto class StreetDto having fields streetId, cityId, countryId, stateId, name, address, postcode
	copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/
	
	private String name, address;
	private int streetId, cityId, countryId, stateId, postcode;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}

	public String getAddress() {
		
		return address;
	}
	
	public void SetAddress( String address) {
		
		this.address = address;
	}
	
	public int getStreetId() {
		
		return streetId;
	}
	
	public void setStreetId(int streetId) {
		
		this.streetId = streetId;
	}
	
	public int getCityId() {
		
		return cityId;
	}
	
	public void setCityId(int cityId) {
		
		this.cityId = cityId;
	}
	
	public int getCountryId() {
		
		return countryId;
	}
	
	public void setCountryId( int countryId) {
		
		this.countryId = countryId;
	}
	
	public int getStateId() {
		
		return stateId;
	}
	
	public void  setStateId(int stateId) {
		
		this.stateId = stateId;
	}
	
	public int getPostcode() {
		
		return postcode;
	}
	
	public void setPostcode(int postcode) {
		
		this.postcode = postcode;
	}
	
	
}

package org.la.student.aqsa.ModelAndDto;

public class StreetDto {
	
	private  int streetId, cityId, countryId, stateId,  postcode;
	private String name, address;
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
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return  streetId+"  "+cityId+"  "+countryId+"  "+stateId+"  "+name+"  "+address+"  "+postcode;
	}


}

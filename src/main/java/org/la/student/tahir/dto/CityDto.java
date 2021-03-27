package org.la.student.tahir.dto;

public class CityDto {


	private String name;
	private int cityId, countryId, stateId, cityCode;
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		
		this.name = name;
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
	
	public int getCityCode() {
		
		return cityCode;
	}
	
	public void setCityCode(int cityCode) {
		
		this.cityCode = cityCode;
	}
	
	public String toString() {
		
		return "Name:" + name + " CityId:"+ cityId + " CountryId:" + countryId + " StateId:" + stateId + " CityCode:" + cityCode;
	}
}

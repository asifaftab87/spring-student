package org.la.student.sajid.cls;

public class City {
	private String cityName;
	private String country;
	
	public City(String n, String c) {
		cityName=n;
		country=c;
	}
	
	public City() {
		System.out.println("default constructor");
		
	}
	
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void show () {
		System.out.println("Name of City "+cityName+", Name of Country: "+country);
	}

}

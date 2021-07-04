package org.la.student.rasheed.clas;

public class Address {
	
	private String door;
	private String street;
	private String postcode;
	private String city;
	
	
	public void print() {
		System.out.println("address door: "+door+" street: "+street+" postcode: "+postcode+" city: "+city);
	}
	
	public String getDoor () {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getStreet () {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode () {
		return postcode;
	}
	public void setPostcode (String postcode) {
		this.postcode = postcode;
	}
	public String getCity () {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	
	}
	
}

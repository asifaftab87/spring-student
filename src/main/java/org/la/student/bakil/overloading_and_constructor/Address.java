package org.la.student.bakil.overloading_and_constructor;

public class Address {

	
	private String door;
	private String street ;
	private String postalcode;
	private String city ;
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public void display () {
		System.out.println("Door address :"+door +"Street address :"+street+"Postaccode :"+postalcode+"City :"+city);
	}
	
}

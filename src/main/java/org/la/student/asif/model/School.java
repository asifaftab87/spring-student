package org.la.student.asif.model;

public class School {

	private String name;
	private String address;
	private String standard;
	
	public School(String name, String address, String standard) {
		this.name = name;
		this.address = address;
		this.standard = standard;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", standard=" + standard + "]";
	}
	
}

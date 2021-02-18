package org.la.student.tahir.dto;

public class Customer {

	private int id;
	private String name;
	private int age;
	private String nationality;
	private char gender;
	
	public Customer() {}
	
	public Customer(int id, String name, int age, String nationality, char gender) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.gender = gender;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality=nationality;
	}
	
	
}

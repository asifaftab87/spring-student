package org.la.student.noura.dto;

public class Workers {
	
	
	private int occupationNumber;
	private String name;
	private int standard;
	private double salary;
	private static String nationality;
    private char gender;
	
	public Workers(int occupationNumber,String name, int s, double salary,String nationality,char gender) {
		
		this.occupationNumber=occupationNumber;
		this.name=name;
		standard=s;
        this.salary=salary;
        this.nationality=nationality;
        this.gender=gender;
	}
	
	public void setName(String name) {
			this.name = name;
		}

	public void setSalary(double salary) {
		this.salary = salary;}
	
	
	public void setOccupationNumber(int occupationNumber) {
		this.occupationNumber=occupationNumber;
	}
	
	
	public void setStandard(int standard ) {
		
		
	}
	public int getOccupationNumber() {
		return occupationNumber;
	}
	
	public int getStandard() {
		return standard;
	}	
	public double getSalary() {
		return salary;
	}	
		
	
	public String getName() {
		return name;
	}
	
	public static String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	}
	



package org.la.student.bakil.overloading;

public class Employee {

	private int id;
	private String employeeName;
	private String emlpoyeePosiotion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmlpoyeePosiotion() {
		return emlpoyeePosiotion;
	}
	public void setEmlpoyeePosiotion(String emlpoyeePosiotion) {
		this.emlpoyeePosiotion = emlpoyeePosiotion;
	}
	public void display() {
		System.out.println("Id :"+id +"Employee name :"+employeeName +"Employee  position :"+emlpoyeePosiotion);
	}
}

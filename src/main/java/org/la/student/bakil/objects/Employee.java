package org.la.student.bakil.objects;
/*
 * Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables. 
   Create object of Employee class in other class inside main method and set all member values and print all member values using getters.
 */
public class Employee {

	private int id;
	private int employeeNum;
	private int cityId;

	
	//Id
	public void setid(int i) {
		id =i;
	}
	public int getid() {
		return id;
	}
	
	//City Id
	public void setcityId(int c) {
		cityId=c;
	}
	public int getcityId() {
		return cityId;
	}
	
	//Employee number
	public void setemployeeNum(int e) {
		employeeNum=e;
	}
	public int getemployeeNum() {
		return employeeNum;
	}
	
	
	 public void display () {
		 System.out.println("Id :"+id+"Employee number :"+employeeNum+"City Id :"+cityId);
	 }
}

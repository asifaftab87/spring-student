package org.la.student.jamal.clas;
/*6.	Create a class Employee having member variables id, 
 * employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables.
 *  Create object of Employee class in other class inside main method and set all member values and 
 *  print all member values using getters.
 * 
 */

public class Employee {
	
	private int id ;
	private String employeeName;
	private int employeeNum;
	private String dateHired;
	private int cityId;
	
	
	public int getId() {
		return id;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getEmployeeNum() {
		return employeeNum;
	}
	
	public String getDateHired() {
		return dateHired;
	}
	
	public int getCityId() {
		return cityId;
		
	}
	
	public void setId(int idn) {
		id =idn;
		
	}
	
	public void setEmployeeName(String ena) {
		employeeName=ena;
	}
	
	public void setEmployeeNum(int en) {
		employeeNum=en;
	}
	
	
	public void setDateHired(String dh) {
		dateHired=dh;
	}
	
	public void setCityId(int cid) {
		cityId=cid;
	}
	
	public void disolay() {
		System.out.println();
	}
	
	
	
	
	
	
	

}

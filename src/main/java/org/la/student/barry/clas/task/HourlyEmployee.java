package org.la.student.barry.clas.task;

public class HourlyEmployee {
	/*
	 * Create a class HourlyEmployee having member variables id, annualSalary, employeeId .
	 *  create getters and setters for all member variables. 
	 *  Create object of HourlyEmployee class in other class inside main method and set all member values 
	 *  and print all member values using getters.
	 */
               
	private int id;
	private int annualSalary;
	private int employeeId;

     public int getId() {
    	 return id;
     }
     public void setId(int i) {
    	 id=i;
     }
     public int getAnnualSalary() {
    	 return annualSalary;
     }
     public void setAnnualSalary(int j) {
    	 annualSalary=j;
     }
     public int getEmployeeId() {
    	 return employeeId;
     }
     public void setEmployeeId(int k) {
    	 employeeId=k;
     }
}

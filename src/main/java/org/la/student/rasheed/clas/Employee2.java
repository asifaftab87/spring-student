package org.la.student.rasheed.clas;

public class Employee2 {
	
	int employId;
	String name;
	String designation;
	String company;
	
	//Here is the Method Name display;
	void display() {
		System.out.println("employId: "+employId);
		System.out.println("name: "+name);
		System.out.println("designation: "+designation);
		System.out.println("company: "+company);
	}
	void setValues(int empId, String n, String d, String c) {
		employId = empId;
		name =n;
		designation = d;
		company = c;
		
	}
	public static void main(String[] args) {
		
		//Always Remember don't call member variable without assigning a variable to it
				//because it can access the variable
		Employee employee = new Employee();
		employee.setValues(1, "abdul", "developer", "boston");
		employee.display();
		
		System.out.println("------------------");
		Employee employee2 = new Employee();
		employee2.setValues(2, "rasheed", "triner", "freelance");
		employee2.display();
		
	
		}

}

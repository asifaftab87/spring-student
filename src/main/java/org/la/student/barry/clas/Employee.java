package org.la.student.barry.clas;

public class Employee {
	int employId ;
	String name;
	String designation;
	String company; 
	
	
	void display(){
		
		System.out.println("employId: "+ employId);
		System.out.println("name: "+ name);
		System.out.println("designation: "+ designation);
		System.out.println("company:"+ company);
	}
    void setValues(Employee employee) {
    	employee.employId = 2;
		employee.name="asif";
		employee.designation="developer";
	    employee.company="boston";
    	
    }
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setValues(employee);
		// student.print();
		
		
	    employee.display();
		
		employee.display();
		
		System.out.println("------------End----------------");
		
		Employee employee2= new Employee();
		employee2.employId=90;
		employee2.name="jawed";
		employee2.designation="trainer";
		employee2.company="freelance";
		employee2.display();
		

	}

}

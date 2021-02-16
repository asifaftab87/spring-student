package org.la.student.tahir.cal;

public class Employee {
				
	
				private int id;
				private String name;
				String designation;
				
				public Employee() {
				
				}
				
				public Employee(int id, String name, String designation) {
					
					this.id=id;
					this.name=name;
					this.designation= designation;
					
					
				}
				
				public void print() {
					
					System.out.println("Id: "+ id);
					System.out.println("Name: "+ name);
					System.out.println("Designation: "+ designation);
				}
				
				public void set(int id, String name, String designation) {
					
					this.id=id;
					this.name=name;
					this.designation= designation;
					
					
				}
				
				void defaultmsg() {
					
					System.out.println("Can only be accessed in same package");
				}
				
				
				
				
				


}

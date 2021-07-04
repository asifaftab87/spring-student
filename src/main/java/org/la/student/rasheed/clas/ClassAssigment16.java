package org.la.student.rasheed.clas;


/*
 * Create a class Company having member variables companyId, name, description. 
 * create getters and setters for all member variables. 
 * Create object of Company class in other class inside main 
 * method and set all member values and print all member values using getters.
 */
public class ClassAssigment16 {

	
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
			name = n;
			designation = d;
			company = c;
			
			
		}
		public static void main(String[] args) {
			
			
			Employee employee = new Employee();
			//Always Remember don't call member variable without assigning a variable to it
			//because it can access the variable
			employee.setValues(1, "abdul", "developer", "boston");
			employee.display();
			
			System.out.println("------------------");
			Employee employee2 = new Employee();
			employee2.setValues(2, "rasheed", "trainer", "freelance");
			employee2.display();

	}

}

package org.la.student.noor;

public class Employee {

		int employId;
		String name;
		String designation;
		String company;

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
			employee.setValues(1, "noor", "developer", "Infosys");
			employee.display();

			System.out.println("-----------------------");
			Employee employee2 = new Employee();
			employee2.setValues(2, "anshu", "trainer", "Tcs");
			employee2.display();

		}

	}

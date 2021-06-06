package org.la.student.noor;

public class Student {

		int roll;
		String name;
		int standard;

		void print() {
			System.out.println("roll: "+roll);
			System.out.println("name: "+name);
			System.out.println("standard: "+standard);
		}

		public static void main(String[] args) {

			Student student = new Student();

			student.roll = 4;
			student.name = "noor";
			student.standard = 2;
			student.print();

			System.out.println("-----------------------");
			Student student2 = new Student();
			student2.roll = 5;
			student2.name = "anshu";
			student2.standard = 1;
			student2.print();

	}

}

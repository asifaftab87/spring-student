package org.la.student.rasheed.clas;

//class always start with capital letter
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
		//Always Remember don't call member variable without assigning a variable to it
		//because it can access the variable
		student.roll =2;
		student.name ="abdul";
		student.standard =3;
		
		student.print();
		
		System.out.println("------------------");
		Student student2 = new Student();
		
		student2.roll =23;
		student2.name ="rasheed";
		student2.standard =90;
		student2.print();
		
		System.out.println("------------------");
		
		Student student3 = new Student();
		
		student3.roll =233;
		student3.name ="ibrahim";
		student3.standard =31;
		student3.print();
		
		
	}

	}



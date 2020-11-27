package org.la.student.tahir;

public class Control_Statement_8 {

	public static void main(String[] args) {
		
		//Provide marks and print corresponding grade.
		
		int mark = 44;
		
		if ( mark >=80) {
			System.out.println("Grade is A");
		}
		
		else if (mark>=60 && mark<80)
		{
			System.out.println("Grade is B");
		}
		
		else if (mark>=50 && mark<60) {
			System.out.println("Grade is C");
		}
		
		else if (mark>=45 && mark<50) {
			System.out.println("Grade is D");
		}
		
		else if (mark>=25 && mark<45) {
			System.out.println("Grade is E");
		}
		
		
		else {
			System.out.println(" Grade is F");
		}

	}

}

package org.la.student.kayes.condition;

public class Grading_System {

	public static void main(String[] args) {
		int mark=60;
		if(mark<25)
			System.out.println("Grade=F");
		if(mark>=25 && mark<45)
			System.out.println("Grade=E");
		if(mark>=45 && mark<50)
			System.out.println("Grade=D");
		if(mark>=50 && mark<60)
			System.out.println("Grade=C");
		if(mark>=60 && mark<80)
			System.out.println("Grade=B");
		if(mark>=80)
			System.out.println("Grade=A");
		

	}

}

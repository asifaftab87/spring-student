package org.la.student.sadique.clas;

public class GradingSystem {

	public static void main(String[] args) {
		/*A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade.*/
		int num =16;
		if(num>80) {
			System.out.println("A Grad");
		}else if(num<=80 && num>60 ) {
			System.out.println(" B Grad");
		}else if(num<=60 && num>50 ) {
			System.out.println(" C Grad");
		}else if(num<=50 && num>45 ) {
			System.out.println(" D Grad");
		}else if(num<=45 && num>25 ) {
			System.out.println(" E Grad");
		}else if(num<25 ) {
			System.out.println(" FAIL");
		}

	}

}

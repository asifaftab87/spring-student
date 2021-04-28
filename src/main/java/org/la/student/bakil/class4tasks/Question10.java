package org.la.student.bakil.class4tasks;
/*
 * A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade
 * */
public class Question10 {

	public static void main(String[] args) {
		
		int x=45;
		
		if (x>80) {
			System.out.println("The grade is : A ");
	        }
		else if (x>60)
		{
			System.out.println("The grade is : B ");
		}
		else if (x>50) {
			System.out.println("The grade is : C ");	
		}
		else if (x>45) {
			System.out.println("The grade is : D ");			
		}
		else if (x>25) {
			System.out.println("The grade is : E ");
		}
		else if (x<25) {
			System.out.println("The grade is : F");
		}

	}

}

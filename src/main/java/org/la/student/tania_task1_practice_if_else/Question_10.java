package org.la.student.tania_task1_practice_if_else;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade.
		**/
int a=55;
if(a>80) {
	System.out.println("the grade is: A");
}
else if(a>60) {
	System.out.println("the grade is: B");
}
else if(a>50) {
	System.out.println("the grade is: C");
}
else if(a>45) {
	System.out.println("the grade is: D");	
}
else if(a>25) {
	System.out.println("the grade is: E");	
}
else { 
	System.out.println("the grade is: F");
}
	}

}

package org.la.student.barry.ifelse;

public class TaskIfElse10 { /*
	A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade.
*/

	public static void main(String[] args) {
		
		int x= 55;
		if (x>80) {System.out.println("the grade is : A ");
         } else if (x>60) {System.out.println("the i grade is : B");
         }
       else if (x>50) {System.out.println("the grade is : C");
        }    else if (x>45) {System.out.println("the grade is : D");
        }   else if (x>25) {System.out.println("the grade is : E");
        }   else if (x<25) {System.out.println("the grade is : F");
        } else {
    	System.out.println("......end......");
       }
   
   }
}
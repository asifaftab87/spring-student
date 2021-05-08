package org.la.student.barry.ifelse;

public class TaskIfElse53 { /*
  wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
   */

	public static void main(String[] args) {
		
	int age=25;
		
		if (age < 13)
		{
			System.out.println(" Kid ");
		}      
		
		else if (age <18 && age >12)
		{
			System.out.println("Teenage ");
		}
		else {
			System.out.println("Adult");
		}
				
    }
}
	

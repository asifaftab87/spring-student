package org.la.student.mdnawaz;

import java.util.Scanner;

public class AddingUserInput {

	public static void main(String[] args) {
		
		int number1, number2;
		
		Scanner scan = new Scanner(System.in);

          System.out.println("Enter the number you want : ");
          number1 = scan.nextInt();
          
          number2 = number1 % 10;
          {
        	 System.out.println("The last digit of the number is : " +number2); 
          }
          
          number2 = number1 / 10;
          {
        	  System.out.println("The remaining numbers are : " +number2);
          }
          
          

	}   

}

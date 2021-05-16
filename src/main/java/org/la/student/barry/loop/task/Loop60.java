package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop60 {
	
	//Wap to swap first and last digits of a number.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	       System.out.print("Enter a number: ");

	       int num = sc.nextInt();    //Taking User Input

	       int n = 0;      //Number of Digits

	       int num2 = num;  //Another variable storing number

	       while(num2>0)  

	       {

	           num2 /= 10;

	           n++;

	       }

	       

	       //Extracting First Digit

	       //First digit is just num/10^(n-1)

	       int firstDigit = num/(int)Math.pow(10,n-1);

	       

	       //Extracting Last Digit

	       //Last digit is simply num/10

	       int lastDigit = num%10;

	       

	       //Now we take remainder of num divided by 10^(n-1), and add lastDigit*10^(n-1)

	       num = (num%(int)Math.pow(10,n-1))+(lastDigit*(int)Math.pow(10,n-1));

	       //Now, we have replaced the first digit with the original last digit

	       

	       //Divide the number to 10 to remove last digit

	       //Integer Data type makes sure that we only get quotient

	       num = num/10;

	       

	       //Now, multiply num with 10 and simply add original first digit

	       num = num*10+firstDigit;

	       

	       System.out.println("Number with swapped digits: "+num); //Printing final number
     }
}

	
  

	
	

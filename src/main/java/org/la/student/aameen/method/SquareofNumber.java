package org.la.student.aameen.method;
import java.util.Scanner;
public class SquareofNumber {

	public static void main(String[] args) {
		// Write a program in java to find the square of any number using the method
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of num");
		num=sc.nextInt();
		
		System.out.println(" Square root of a given num is : " +square(num));
		
	}
	 static int square(int a)
	 {
		
		 return a*a; 
	 }

}

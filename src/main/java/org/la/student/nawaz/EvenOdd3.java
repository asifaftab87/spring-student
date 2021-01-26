package org.la.student.nawaz;

import java.util.Scanner;

public class EvenOdd3 {
	
	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println(" Enter a Number: ");
		int num=reader.nextInt();
	
	if (num%2==0) {
		System.out.println("The Given Number is Even: " +num);
	}
	else {
		System.out.println("The Given Number is Odd: " +num);
	}

}
}
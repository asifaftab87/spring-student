package org.la.student.noura.method;
import java.util.Scanner;

public class PrintSumofTwoNumbers {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1,num2: ");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		int c=sum(num1,num2);
        System.out.println("sum of two numbers :"+c);
	}

	static int sum(int a ,int b) {
		int sum =a+b;

		return sum;
	}
	
}
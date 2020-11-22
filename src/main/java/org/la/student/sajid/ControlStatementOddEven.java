package org.la.student.sajid;

import java.util.Scanner;

public class ControlStatementOddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Give Me You Number");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("Your Number is Even");
		}else {
			System.out.println("Your Number is Odd");
		}
		

	}

}

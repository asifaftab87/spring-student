package org.la.student.sajid;

import java.util.Scanner;

public class ControlStatementPostiveNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Gave me your Number, I will check");
		int numb=s.nextInt();
		
		if(numb>0) {
			System.out.println("Your Number is Positive");
		}else {
			System.out.println("Your Number is Negative");
		}
				
		

	}

}

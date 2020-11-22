package org.la.student.sajid;

import java.util.Scanner;

public class ControlStatment01 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Gave me your Number, I will check");
		int num = a.nextInt();
		
		if(num>18) {
			System.out.println("Gratest Number,You can Vote");
		}else{
			System.out.println("Do Not Greatest Number");
		}

		
	}

}

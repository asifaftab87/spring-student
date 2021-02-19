package org.la.student.sadique;

public class UseTernaryFor3Digit {

	public static void main(String[] args) {
		// wap to print ternary if number is 3 digit.
		// using without if and else
		int a = 3565;
		for(;a>99 && a<1000;) {
			System.out.println("ternery");
			break;
		}
		for(;a<99 || a>1000;) {
			System.out.println("invalid");
		    break;
		 }
		//using  if and else.
		int z=123;
		if(z>99 && z<1000){
			System.out.println("ternery");
		} else {
			 System.out.println("invalid");
		}
	}

}

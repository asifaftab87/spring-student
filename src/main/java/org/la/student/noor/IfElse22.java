package org.la.student.noor;
//wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
public class IfElse22 {

	public static void main(String[] args) {
		int age=24;
		
		 if(age<13) {
			 System.out.println("kid");
		 }
		 else if(age<18 && age>12) {
			 System.out.println("teenage");
		 }
		 else
		 {
			 System.out.println("adult");
		 }

	}

}

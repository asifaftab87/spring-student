package org.la.student.nizaam.week4tasks;

public class Q54Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
		
		int age=25;
		if(age<13) {
			System.out.println("kid");
		}else if(age>12 && age<18) {
			System.out.println("Teenager");
		}else if(age >18)
			System.out.println("Adult");

	}

}

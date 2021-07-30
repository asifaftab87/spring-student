package org.la.student.tania_task1_practice_if_else;

public class Question_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18

	int age =15;
	if(age<13) {
		System.out.println("Kid");
	}
	else if(age<18 && age>12) {
		System.out.println("teenage");
	}
	else {
		System.out.println("Adult");
	}
	
	}

}

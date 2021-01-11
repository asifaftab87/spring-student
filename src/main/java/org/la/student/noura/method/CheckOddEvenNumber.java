package org.la.student.noura.method;

public class CheckOddEvenNumber {

	public static void main(String[] args) {

//program to check if the number is odd or even 
         check(12);		
	}

	static void check(int a) {
		
		
		if(a%2==0) {
			System.out.println(a+" is even number");
		}
		else {System.out.println(a+" is odd number");}
	}
}

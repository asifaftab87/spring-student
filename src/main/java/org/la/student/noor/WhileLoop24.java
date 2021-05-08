package org.la.student.noor;
//wap to find factorial of a given number
public class WhileLoop24 {

	public static void main(String[] args) {
		int i=1,fact=1;
		int number=5;
		while(i<=number) {
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial of "+number+" is: "+fact);

	}

}

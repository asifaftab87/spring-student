package org.la.student.tania;

public class Nested_else_if_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=50;
		
		if(x>=60) {
			System.out.println("A");	
		}
		else if(x>=50) {
			System.out.println("B");	
		}
		
		else if(x>=40) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}

		System.out.println("End");
		
		// example 2 
		//find the larger  number
		
		int a=1,b=2,c=3;
		
		if(a>b && a>c) {
			System.out.println("a: "+a);
		} 
		
		else if(b>a && b>c) {
			System.out.println("a: "+b);
		}
		
		else {
			System.out.println("c: "+c);
		}
			
	}

}

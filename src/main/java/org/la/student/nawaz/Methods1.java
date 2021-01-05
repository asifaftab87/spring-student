package org.la.student.nawaz;

public class Methods1 {
	
	public static void main(String[] args) {
		
		Addition(10,20);
		Subtraction(30,20);
		Multiplication(40,40);
		Division(100,10);
		
		System.out.println();
		
		Division(200,10);
		Multiplication(15,5);
		Subtraction(70,20);
		Addition(35,75);
		
	}
		
		public static void Addition(int a,int b) {
			System.out.println(a+b);
		}
			
		public static void Subtraction(int a,int b) {
		    System.out.println(a-b);
		}
		
		public static void Multiplication(int a,int b) {
			System.out.println(a*b);
		}
		
		public static void Division(int a,int b) {
			System.out.println(a/b);
		}
	

}

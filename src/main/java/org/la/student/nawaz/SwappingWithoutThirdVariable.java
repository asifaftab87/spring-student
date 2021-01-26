package org.la.student.nawaz;

public class SwappingWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int a=30, b=50;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Number of a after Swapping without using the Third Variable: " +a);
		System.out.println("The Number of b after Swapping without using the Third Variable: " +b);
	}

}

package org.la.student.tahir.method;

public class MethodOverloading {
	//Overloading of Addition and Subtraction both having name Arithmetic
	public static void main(String[] args) {
		
		int x =2, y=3, z=4;
		
		
		System.out.println(Arithmetic(x,y));
		System.out.println( Arithmetic(z,y,x));
		 
		// Arithmetic(z,y,x);
		
	}
	
	
	static int  Arithmetic(int a, int b) {
		
		System.out.println(" Addition " );
		
		int sum= a+b;
		return sum;
		
	}
	
	static int Arithmetic( int a, int b, int c)  {
		
	System.out.println("Subtraction" );
	
	int diff = a-b-c;
	return diff;
		
	}

}

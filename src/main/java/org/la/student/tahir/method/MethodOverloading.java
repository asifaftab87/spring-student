package org.la.student.tahir.method;

public class MethodOverloading {
	//Overloading of Addition and Subtraction both having name Arithmetic
	public static void main(String[] args) {
		
		int w=5, x =2, y=3, z=4;
		
		
		System.out.println(Arithmetic(x,y));
		System.out.println( Arithmetic(z,y,x));
		System.out.println(Arithmetic(z));
		System.out.println( Arithmetic(z,y,x,w));
		 
		
		
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
	
	static int Arithmetic( int a)  {
		
		System.out.println("Square" );
		
		int Sqr = a*a;
		return Sqr;
			
		}
	
static double Arithmetic( double a, double  b, double  c, double  d)  {
		
		System.out.println("Average" );
		
		double Avr = (a+b+c+d)/4;
		return Avr;
			
		}
	
	
	
	

}

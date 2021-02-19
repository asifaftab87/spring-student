package org.la.student.sadique;

public class FibonacciSeries {
public static void main(String[] args) {
	
	//Wap to print Fibonacci series up to n terms.
	
	int a=1,b=1,s=a+b;
	
	System.out.print(a);
	System.out.print(","+b);
	
	for(int i=1;i<=7;i++) {
	
		System.out.print(","+s);
		
		a=b;
		b=s;
		s=a+b;
		
	}
  }
}

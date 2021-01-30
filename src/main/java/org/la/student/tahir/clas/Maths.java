package org.la.student.tahir.clas;

public class Maths {
	
	private int z=10;

	public void  largest(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println(a+ " is the largest");
		}
		
		else if( b>a && b>c) {
			System.out.println(b+" is the largest");
		}
		
		else
			System.out.println(c+ " is the largest");
	}
	
public void  smallest(int a, int b, int c) {
		
		if(a<b && a<c) {
			System.out.println(a+ " is the smallest");
		}
		
		else if( b<a && b<c) {
			System.out.println(b+" is the smallest");
		}
		
		else
			System.out.println(c+ " is the smallest");
	}

	public int getinteger() {
	
	return z; 
}

	public int addition (int a, int b, int c) {
	
		int sum =  a+b+c;
		return sum;
}
}


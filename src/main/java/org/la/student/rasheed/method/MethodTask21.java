package org.la.student.rasheed.method;
/*
 * find percentage and return result
	long factorial(int)
 */

public class MethodTask21 {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(fact(n) );
		
	}
	static long fact (int x) {
		long fact =1;
		
		if(x==0)
			
			return 1;
		
		for(int i =x; i>0; i--, x--) {
			fact = fact*x;
			
			
			
		}
		return fact;
		
	}


}

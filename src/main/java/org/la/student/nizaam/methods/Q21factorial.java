package org.la.student.nizaam.methods;

public class Q21factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		System.out.println(fact(n));
	}
	
	static long fact(int a) {
		
		long fact=1;
		
		if(a==0)
			return 1;
		for(int i=a;i>0;i--,a--) {
			fact = fact*a;
		}
		return fact;
	}

}

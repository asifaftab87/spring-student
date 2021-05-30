package org.la.student.noor;
/*long factorial(int)
find factorial of given argument and return result*/

public class MethodQ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
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

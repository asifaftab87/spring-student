package org.la.student.aameen.method;

public class AcceptandReturnMethod {

	public static void main(String[] args) {
		// Method accept and return argument 
		System.out.println(" Main Method ");
		
		boolean c = div(3);
		System.out.println(" return from div : " +c);
		
	}
	static boolean div(int a )
	{
		return a == 2;
	}

}

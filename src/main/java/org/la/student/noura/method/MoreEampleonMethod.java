package org.la.student.noura.method;

public class MoreEampleonMethod {

	public static void main(String[] args) {
		//more examples on methods
		nb(true,3);
		char c=meth();
		System.out.println(c);
	
		int s=3;
		factorial(s);
		char aa=meth1(true);
	}
	//accept but not return 
	static void nb(boolean t, int i) {
		System.out.println("Hi "+t+" "+i);
		
	}
	

	//return but not accept
	static char meth() {
		System.out.println("hello");
		return 'a';
	}
	
	// accept and return 
	static char meth1(boolean b) {
		System.out.println("hellow world"+b);
		return 's';
	}
	
	static void factorial(int a) {
		int f=1;
		while(a>0) {
			f=f*a;
			a--;
			
		}
		System.out.println("factorial: "+f);
	}
}

package org.la.student.noura.call;

public class CallByReference {

	public static void main(String[] args) {
		//calling method
		int x[]= {70,60};
		System.out.println(" x[0]: "+x[0]);

		reference(x);
		System.out.println(" x[0]: "+x[0]);

		value(x[1]);
		System.out.println(" x[1]: "+x[1]);
	}

	//called method
	static void reference(int y[])//no need of mentioning the size
	{
		System.out.println("value before  y[0]: "+y[0]);

		y[0]=4;
		System.out.println(" value after y[0]: "+y[0]);

	}
	

	static void value(int a) {
		System.out.println("value before a:"+a);
		a=3;
		System.out.println("value after a:"+a);

		
	}
	
	
	

}

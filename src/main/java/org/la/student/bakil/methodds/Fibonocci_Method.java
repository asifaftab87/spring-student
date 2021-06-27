package org.la.student.bakil.methodds;
/*
 * void fibonocci(int)
		print fibonacci series 
 */
public class Fibonocci_Method {


	public static void main(String[] args) {
	
		fibonocci (2);
		
	}

	
	 static void fibonocci(int a) {
	
		
		 int b=1,c;
			for(int i=1;i<=5;i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				
	}
		
		
}
}


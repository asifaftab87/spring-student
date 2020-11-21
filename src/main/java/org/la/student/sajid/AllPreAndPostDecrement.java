package org.la.student.sajid;

public class AllPreAndPostDecrement {

	public static void main(String[] args) {
		// Pre Decrment
		int a=1,b;
		b=--a;
		System.out.println("Pre Decrment");
		System.out.println(a+","+b);
		
		//Post Decrment
		int c=5,d;
		d=c--;
		System.out.println("Post Decrment");
		System.out.println(c+","+d);
		
		//Pre Decrement Multiply
		
		int e=2,f;
		f=--e*5;
		System.out.println("Pre Decrement Multiply");
		System.out.println(e+","+f);
		
		
		//Post Decrement Multiply
		
		int g=8,h;
		h=g--*6;
		System.out.println("Post Decrement Multiply");
		System.out.println(g+","+h);
				
		



	}

}

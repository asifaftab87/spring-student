package org.la.student.tania;

public class Operation_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//17. 
		int a = 31, b = 40;
		int c = b - a;
		b = c % a;
		b = b / a;
		a = ++c;
		b = (a - --b) * c;
		System.out.println("c= "+c);
		System.out.println("b= "+b);
		System.out.println("b= "+b);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}

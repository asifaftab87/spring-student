package org.la.student.md;

public class PrePostIncrement {

	public static void main(String[] args) {


		int a = 3;
		int b = ++a;
		System.out.println("The value of a :" +a);
		System.out.println("The value of b :" +b);
		
		System.out.println();
		
		int c = -3;
		int d = c++;
		System.out.println("The value of c :" +c);
		System.out.println("The value of d :" +d);
		
		System.out.println();
		
		int e = 3;
		int f = ++e + 9;
		System.out.println("The value of e :" +e);
		System.out.println("The value of f :" +f);
		
		System.out.println();
		
		int g = 3;
		int h = g++ * 6;
		System.out.println("The value of g :" +g);
		System.out.println("The value of h :" +h);
		
		System.out.println();
		
		int i = 3;
		int j = i++ / 3;
		System.out.println("The value of i :" +i);
		System.out.println("The value of j :" +j);

	}

}

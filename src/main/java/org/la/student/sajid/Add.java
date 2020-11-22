package org.la.student.sajid;

public class Add {

	public static void main(String[] args) {
		/*int a=2;
		int s = a+5;
		System.out.println(s);
*/
		int a = 27/ 4+9;
		System.out.println("a = "+a );
		int b = 52/ 6-3;
		System.out.println("b = "+b);
		int c = 3;
		System.out.println("c = "+c);
		c = a++ - b;
		System.out.println("c = "+c);
		a = a * b;
		System.out.println("a = "+a);
		b = b + a;
		System.out.println("b = "+b);
		a = (a< c) ? a%c : c%a;
		System.out.println("a = "+a);
		System.out.println("a = "+a +" b = " + b + " c = "+c);
	}

}

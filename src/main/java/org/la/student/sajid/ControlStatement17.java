package org.la.student.sajid;

public class ControlStatement17 {
	public static void main(String[] args) {
		int a=31,b=40;
		int c=b-a;
		System.out.println(c);
		b=c%a;
		System.out.println(b);
		b=b/a;
		System.out.println(b);
		a=++c;
		System.out.println(a);
		b=(a- --b)*c;
		System.out.println(b);
		System.out.println(a+","+b+","+c);
	}

}

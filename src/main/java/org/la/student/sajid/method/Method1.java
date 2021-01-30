package org.la.student.sajid.method;

public class Method1 {
	public static void main(String[] args) {
		
		System.out.println("test main method");
		fun();
		sum('Z');		//(char d='Z'; sum(d) this is same ) you can change(only set char value)
		sum1(25,236.35);
		System.out.println("end");
	}
	
	static void fun() {
		System.out.println("test fun method");
	}
	
	static void sum(char a) {
		System.out.println("value of argument: "+a);
	}
	
	static void  sum1(int a,double d) {
		System.out.println("value of int: "+a+", value of double: "+d);
	}

}

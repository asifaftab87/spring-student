package org.la.student.tahir.method;

public class Acceptargument {
	//Accept an argument
	public static void main(String[] args) {
		
		int x =2, y=3;
		
		arg(x, y);
	
		char d= '1';
		cha(d);
		
	}
	
	
	static void arg (int a, int b) {
		
		System.out.println(" Add " + (a+b));
		
	}
	
	static void cha( char a)  {
		
		System.out.println("The char value is : " +a);
		
	}

}

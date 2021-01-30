package org.la.student.aameen.method;
    			//Accept more than 1 argument

public class SimpleMethod2 {
	
	
	static void argument2(int a , double b )
	{
		System.out.println(" the value of int a : " +a + " , double b : " +b);
	}
	
	
	public static void main(String[] args) {
								
		System.out.println(" Main Method");
		
		argument1('2');
		
		argument2(12,32.4);
		
		
	}
	
	
	static void argument1(char c)
	{
		System.out.println(" the value of argument c : " +c);
	}
	
	
}

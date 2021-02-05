package org.la.student.noura.clas;

public class Fibonacci {

	
	private int num1;
	private int num2;
	private int s;
	
	
	 
    public void fib(int a, int b) {
    
    	System.out.print(a+"  "+b);
    	for(int i=1;i<=8;i++) {
    		int c=a+b;
			System.out.print("  "+c);
    			a=b;
    			b=c;
    		    c=a+b;

    		}
        } 
	
    }
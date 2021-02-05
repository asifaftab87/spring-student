package org.la.student.noura.clas;

public class Fibonacci {

	
	private int num1;
	private int num2;
	private int s;;



	 public void setValue(int a,int b,int c) {
	    	
	    	num1=a;
	    	num2=b;
	    	s=c;
	    	}

    public void fib(int a, int b) {
    
    	

    	for(int i=1;i<=5;i++) {
    		int c=a+b;
			System.out.print("  "+c);

    			a=b;
    			b=c;
    		    c=a+b;

    		}
        } 
    }
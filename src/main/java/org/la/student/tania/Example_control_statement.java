package org.la.student.tania;

public class Example_control_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if (statement)
		// example1
		
		int a=10;
		if (a>0) {
			System.out.println("positve");
		}
		System.out.println("End of the code");
		
		//Example2
		int b=-10;
		if (b>0) {
			System.out.println("positve");//since the condition is false if statement won't be execute
		}
		System.out.println("End of the code");
		
		// Example 3
		int c=552;
		if(c%3==0) {
			System.out.println(c+ " Number divisible by 3");
		}
		System.out.println("End of the program");
		
		//Example4
		
		int d=551;
		if(d%3==0) {
			System.out.println(d+ " Number divisible by 3");
		}
		System.out.println("End of the program");
		
		//Example4
		
	    int e=551;
	    if(e%2==0) {
	    	System.out.println(e+ " Number is even");
	    }
	    if (e%2==1) {
	    	System.out.println(e+ " NUmber is odd"); 	
	    }
	    System.out.println("End of the pogram");
		
	}

}

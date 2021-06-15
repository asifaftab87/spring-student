package org.la.student.barry.array.taks5;
public class QueArray20 {
//wap to calculate the factorial of each element of an array?
	  public static void main(String[] args) {  
		  int factorialA[] = new int[5]; 
		    for (int i=0; i<5; i++) { 
		       int factorial = 1; 
		       for(int j=1; j<=i+1; j++) { 
		          factorial = factorial *j; 
		       } 
		      factorialA[i] = factorial; 
		    } 
		    System.out.println(factorialA[4]); 
	    }
	}  
 

package org.la.student.barry.loop;

public class FactorialFor {

	public static void main(String[] args) {

       int f = 1;
       int n= 5;
       
     for(; n>=1; n--) {
    	  
    	  f= f*n;
       } 
       System.out.println("Factorial:" +f);
	}

}
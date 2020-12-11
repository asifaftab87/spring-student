package org.la.student.noura.loop;

public class PrimeNum {

	public static void main(String[] args) {
		

		int n =4 , r= 2;
		while (r<n) {
			
	        	if (n%r==0)
		{
			break;
		}
		r++;}
		System.out.println(r);
		
		if (r==n) {System.out.println(n+ "   is prime number");}
		else {System.out.println(n+ "   is  not prime number");}
	}
        

	}



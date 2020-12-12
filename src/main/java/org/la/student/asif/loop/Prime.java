package org.la.student.asif.loop;

public class Prime {

	//wap for prime number
	
	public static void main(String[] args) {
		
		int n=11, r=2;
		
		while(r<n) {
			
			if(n%r==0) {
				break;
			}
			 
			r++;
		}
		
		if(r==n) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
}

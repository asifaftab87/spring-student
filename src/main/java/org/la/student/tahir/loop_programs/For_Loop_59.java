package org.la.student.tahir.loop_programs;

public class For_Loop_59 {

	public static void main(String[] args) {
		//Wap to print all Prime numbers between 1 to c.
		
	int c =20;
	
	for (int i =1; i<=c; i++) {
		
		int n=i, r=2;
		
		while(r<n) {
			
			if(n%r==0) {
				break;
			}
			 
			r++;
		}
		
		if(r==n) {
			System.out.println(n+" is a prime number");
		}
		
	}
	}}


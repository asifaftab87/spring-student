package org.la.student.tahir.loop_programs;

public class For_Loop_60 {

	public static void main(String[] args) {
		//Wap to find sum of all prime numbers between 1 to n.
		
		int c =20, sum=0 ;
		
		for (int i =1; i<=c; i++) {
			
			int n=i, r=2;
			
			while(r<n) {
				
				if(n%r==0) {
					break;	
						}
				 
				r++;	
						}
			
			if(r==n) {
				sum = sum +n;
								}
			
										}
		
		
		System.out.println(sum +" is a prime number");
		
		
	}
}


package org.la.student.tahir.loop_programs;

public class For_Loop_63 {

	public static void main(String[] args) {
		//Wap to check whether a number is Perfect number or not.
		
		int n=6;
		int sum =0;
		
		for(int i=1; i<=n/2; i++) {
			
			if (n%i ==0) {
				
				sum = sum + i;
			}
		}
			
			if(sum==n) {
				System.out.println("Perfect");
			}
			else
				System.out.println("not perfect");
			
		
		
	}
}


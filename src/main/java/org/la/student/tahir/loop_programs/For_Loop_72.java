package org.la.student.tahir.loop_programs;

public class For_Loop_72 {

	public static void main(String[] args) {
		
		//Q82... printing numbers in pattern

		int n = 3;
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int s=1 ; s<=n-i ; s++) {
				System.out.print(" ");
			}
			
			for(int k=1 ; k<=i ; k++) {
				System.out.print(i);
			}
			
			System.out.println("");
		}
	}
}


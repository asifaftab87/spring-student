package org.la.student.tahir.loop_programs;

public class For_Loop_Pattern_Printing_4 {

public static void main(String[] args) {
	///decreased star right side
		

	int n = 7;
	
	for(int i=0 ; i<n ; i++) {
		
		for(int s=1 ; s<=i ; s++) {
			System.out.print(" ");
		}
		
		for(int k=1 ; k<=n-i ; k++) {
			System.out.print("*");
		}
		
		System.out.println("");
	}
	}

}

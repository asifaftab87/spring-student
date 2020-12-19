package org.la.student.tahir.loop_programs;

public class For_Loop_Pattern_Printing_2 {

public static void main(String[] args) {
	//Increased star right side
		
		int n = 5;
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int s=1 ; s<=n-i ; s++) {
				System.out.print(" ");
			}
			
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}

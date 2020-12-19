package org.la.student.tahir.loop_programs;

public class For_Loop_Pattern_Printing_3 {

public static void main(String[] args) {
	//decreased star 
		
		int n = 5;
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int s=1 ; s<=n-i ; s++) {
				System.out.print("*");
			}
			
			
			
			System.out.println("");
		}
	}

}

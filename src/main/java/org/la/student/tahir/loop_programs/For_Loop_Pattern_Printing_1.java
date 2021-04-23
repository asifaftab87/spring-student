package org.la.student.tahir.loop_programs;

public class For_Loop_Pattern_Printing_1 {

	public static void main(String[] args) {
		//increased star
		int n=3;
		for (int i=1; i<=n; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}

	}

}

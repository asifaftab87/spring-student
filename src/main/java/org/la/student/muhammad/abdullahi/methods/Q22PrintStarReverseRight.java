package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22PrintStarReverseRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		printStar(5);
	
		
		
	}	
		static void printStar(int n) {
			for(int i=n;i>=0;i--) {
				for(int j=n;j>0;j--) {
					if(j<=i)
						System.out.print("*");
					else
						System.out.print(" ");
	}
				System.out.println();
}
		}
		}
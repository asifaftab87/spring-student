package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22PrintDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		printStar(5);
	
		
		
	}	
		static void printStar(int n) {
			int j=0;
			for(int i=-n;i<=n;i++) {
				
				if(i<0)
					j=-i;
				else
					j=i;
				//printing space
				for(int k=1 ; k<=j ; k++) {
					System.out.print(" ");
				}
				//printing star
				for(int k=0 ; k<=n-j ; k++) {
					System.out.print("* ");
				}
				System.out.println();
				}
		}
		}
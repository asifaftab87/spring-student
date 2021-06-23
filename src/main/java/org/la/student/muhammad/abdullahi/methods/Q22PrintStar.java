package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PrintStar(5);
	
		
		
	}
	static void  PrintStar (int n) {
		
		for(int i=1;i<=n;i++) {
			for(int str=0;str<i;str++) {
			System.out.print("*");	
			}
			System.out.println();
		}
				
	
	}
}
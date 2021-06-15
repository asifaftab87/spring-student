package org.la.student.bakil.Class_8_Methods;
/*
 * void printStarFromRight(int n)
		print star pattern from right
 */
public class PrintStarFromRight_Method {


	public static void main(String[] args) {
	
		int n = 5;
		
		starRight(n);
	}
	
	static void starRight(int n) {
		
		for (int i=1;i<=n;i++) {
			
			//print spce
			for(int spc=1;spc<=n-i;spc++) {
				System.out.print(" ");
			}	
		   
			//print stars
		for (int y=1;y<=i;y++) {
			System.out.print("*");
		}
		
		System.out.println("");
			}
	}
	



	
	}


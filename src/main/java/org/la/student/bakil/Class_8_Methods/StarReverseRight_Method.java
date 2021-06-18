package org.la.student.bakil.Class_8_Methods;
/*
 * 	void printStarReverseRight(int n)
		print star in decreasing order from right
 */
public class StarReverseRight_Method {


	public static void main(String[] args) {
	
		int n = 5;
		
		printStarFromRight(n);
	}
	
	static void printStarFromRight(int n) {
		
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


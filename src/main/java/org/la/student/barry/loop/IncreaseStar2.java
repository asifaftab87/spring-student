package org.la.student.barry.loop;

public class IncreaseStar2 {
	public static void main(String[] args) {
	
		/* int n=10;
		 * for(int j=1; j<=n; j++) {
		 * printing space 
		 * for(int spc=1; spc<=n-j;spc++){
		 * System.out.print(" ");
		 * }
			for(int y=1; y<=j; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		int n=4;
		for(int i=1; i<=n; i++) {
			// space printing
			for(int spc =i; spc<= n-1; spc++) {
				System.out.print(" ");
			}
			for (int str=1; str<=i; str++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
				
	}  

}

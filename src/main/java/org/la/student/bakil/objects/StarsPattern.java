package org.la.student.bakil.objects;
/*
 * create a class having name Pattern, then add methods to print all patterns like increaseStar, decreaseStar, increaseStartFromRight, 
   decreaseStartFromRight, diamond, pyramid, reversePyramid.
   All these methods will accept one int argument and will not return anything.
	
 */
public class StarsPattern {

	
	public void increaseStar (int n ) {
		for (int j=1; j<=n ; j++) {
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void decreaseStart (int n) {
		for (int j=1; j<=n; j++) {
			for(int y=1; y<=n-j+1; y++) {
				System.out.print("*");
			}
			System.out.println("");

	}
	
	}
	
	public void increaseStartFromRight(int n) {

		for(int j=1 ; j<=n ; j++) {
			
			//printing space
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print("");
			}
			//printing start
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void decreaseStartFromRight(int n) {
		for(int j=1 ; j<=n ; j++) {
			//printing space
			for(int spc=1 ; spc<j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=n-j+1 ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void Dimond (int n) {
for(int i=-n ; i<=n ; i++) {
			
			int j=i;
			if(j<0){
				j = -j;
			}
			
			//printing space
			for(int k=1 ; k<=j ; k++) {
				System.out.print(" ");
			}
			//printing star
			for(int k=0 ; k<=n-j ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public void Pyramid (int n) {
for(int j=1 ; j<=n ; j++) {
			
			//printing space
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=j ; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public void reversePyramid (int n) {
		for(int j=1 ; j<=n ; j++) {
			//printing space
			for(int spc=1 ; spc<j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=n-j+1 ; y++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}


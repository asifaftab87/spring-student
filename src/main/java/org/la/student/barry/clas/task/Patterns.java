package org.la.student.barry.clas.task;

public class Patterns {
	/*
	 * creat a class having name Pattern, then add methods to print all patterns like increaseStar, 
	 * decreaseStar, increaseStartFromRight, decreaseStartFromRight, diamond, pyramid, reversePyramid.
         All these methods will accept one int argument and will not return anything.
	 */
	
	public void increaseStar(int n) {
		
		for(int j=1; j<=6; j++) {
			for(int y=1; y<=j; y++) {
				System.out.print("*");
			}
			System.out.println("");
	}
  }
	public void decreaseStar(int n ) {
		for(int j=1; j<=n; j++) {
			for(int y=1; y<=n-j+1; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
	public void increaseStarFromRight(int n) {
	
		for(int j=1 ; j<=n ; j++) {
			
			
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print(" ");
			}
			
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void decreaseStarFromRight(int n) {
		for(int j=1; j<=n; j++) {
			// printing space
			for(int spc=1; spc<=j; spc++) {
				System.out.print(" ");
			}
			// printing start
			for(int y=1; y<=n-j+1; y++) {
				System.out.print("*");
			}
			System.out.println("");
	  }
    }
	public void diamond(int n) {
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
    public void pyramid(int n) {
    	
   
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
    public void reversePyramid(int n) {
    
    	for(int j=1 ; j<=n ; j++) {
			//printing space
			for(int spc=1 ; spc<j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=n-j+1 ; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
    	
    }
}
   
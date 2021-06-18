package org.la.student.noor;

public class Pattern {
	public void decreaseStar(int n) {

		for(int j=1; j<=n; j++) {
			for(int y=1; y<=n-j+1; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void increaseStar(int n) {

		for(int j=1 ; j<=n ; j++) {
			for(int y=1; y<=j ; y++) {
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
		
		public void reversePyramid(int n) {
			int rows=5;  
			for (int i= 0; i<= rows-1; i++)  
			{  
			for (int j=0; j<=i; j++)  
			{  
			System.out.print(" ");  
			}  
			for (int k=0; k<=rows-1-i; k++)  
			{  
			System.out.print("*" + " ");  
			}  
			System.out.println();  
		}
}
		public void increaseNumber(int n) {
			int i, j, rows=4;  
			for (i = 1; i <= rows; i++)   
			{  
			for (j = 1; j <= i; j++)  
			{  
			System.out.print(i+" ");  
			}  
			System.out.println();  
			}           
		}
}
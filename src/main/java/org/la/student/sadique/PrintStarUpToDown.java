package org.la.student.sadique;

public class PrintStarUpToDown {

	public static void main(String[] args) {
		// wap to print star decrease up to down
		int n=6;
		
		for( int i=0; i<=6; i++) {
		       
			for( int j=1; j<=n-i; j++) {
				System.out.print(" "+"");
			}
			for(int k=1; k<i;k++) {
			    System.out.print("*"+"*");
		    }
				System.out.println(" "+" ");

	}
		int m=6;
		for( int i=0; i<=6; i++) {
		
			for( int j=1; j<=m-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				//m++;
			    System.out.print("1");
		    }
				System.out.println(" ");
				m++;

	}

	}
	
	}

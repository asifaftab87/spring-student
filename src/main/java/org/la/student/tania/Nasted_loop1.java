package org.la.student.tania;

public class Nasted_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		for(int i=1; i<=n;i++) {
			 for(int j=1; j<=n-i+1; j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	}

}

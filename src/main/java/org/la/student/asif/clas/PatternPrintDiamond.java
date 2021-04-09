package org.la.student.asif.clas;

public class PatternPrintDiamond {

	public static void main(String[] args) {
		PatternPrintDiamond obj = new PatternPrintDiamond();
		obj.diamond(3);
	}
	
	public void diamond(int n) {
	
		System.out.println("diamong instance");
		
		for(int i=-n ; i<=n ; i++) {
			
			int k = i;
			
			if(k<0)
				k = -k;
			
			for(int j=0 ; j<=k ; j++) {
				System.out.print(" ");
			}
			for(int j=k ; j<=n ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}

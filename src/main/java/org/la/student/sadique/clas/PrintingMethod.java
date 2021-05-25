package org.la.student.sadique.clas;

public class PrintingMethod {
	public static void main(String[] args) {
		
	


		// All star printing method in same class.
	
	
		//static  method1(char m);
		System.out.println("Left to right decrese ");
		int m=4;
		for(int n=1;n<=m;n++) {
			for(int o=1;o<=n;o++) {
				System.out.print("");
			}for(int j=1;j<=n;j++) {
				System.out.print("> ");
			}
			System.out.println("");
		}
		//static void method2();
		System.out.println("Daimond Shape");
		
		int w=6;
		for(int i=1;i<=w;i++) {
			for(int j=1;j<=w-i;j++) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print("^ ");
			}
			System.out.println(" ");
		}
		//static void method();
		
		System.out.println("Left to right decrese down ward");

		int r=6;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print(" <");
			}for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	
	}
	
}

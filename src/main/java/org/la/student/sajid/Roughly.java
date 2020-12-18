package org.la.student.sajid;

public class Roughly {
	public static void main(String[] args) {
		
		int c=5;
		for(int a=0;a<=c;a++) {
			
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			
			for(int d=1;d<=c-a;d++) {
			System.out.print("*");
			}
			System.out.println("");
		} 
	}
}

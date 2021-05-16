package org.la.student.barry.loop;

public class PrintNumRowlFromRight {

	public static void main(String[] args) {
		int n=5;
		for(int a =1; a<=n; a++) {
			for(int spc=1; spc<=n-a; spc++) {
				System.out.print(" ");
			}
			for(int x=1; x<=a; x++) {
				System.out.print(a);
			}
			System.out.println("");
		}

	}

}

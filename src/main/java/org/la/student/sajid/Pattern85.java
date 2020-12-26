package org.la.student.sajid;

public class Pattern85 {
	public static void main(String[] args) {
		int n=3;
		for(int a=1;a<=n;a++) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(" ");
			}for(int k=1;k<=a;k++) {
				System.out.print(a);
			}System.out.println();
		}
	}

}

package org.la.student.sajid;

public class Pattern84 {
	public static void main(String[] args) {
		int n=3;
		for(int a=1;a<=n;a++) {
			for(int i=1;i<=n-a;i++) {
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print(k);
			}System.out.println();
		}
	}

}

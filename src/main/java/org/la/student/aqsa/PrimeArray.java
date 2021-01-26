package org.la.student.aqsa;

import java.util.Scanner;
public class PrimeArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		primeno(a);
}
	static void primeno(int[] a) {
		for(int i=0;i<10;i++) {
			int k=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
				k++	;
				}
			}
		if(k==2) {
			System.out.println(a[i]);
		}
		}
	}
}
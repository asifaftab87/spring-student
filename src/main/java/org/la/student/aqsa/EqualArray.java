package org.la.student.aqsa;

import java.util.Scanner;

public class EqualArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		int[] b= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		for(int j=0;j<a.length;j++) {
			b[j]=sc.nextInt();
			}
		sc.close();
		System.out.println(equality(a,b));
}
	static boolean equality(int[] a,int[] b) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				k++;
			}
		}
		if(k==a.length) {
			return true;
		}
		else 
			return false;
	}
}
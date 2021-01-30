package org.la.student.aqsa;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		duplicateElement(a);
		}
	static void duplicateElement(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
	}

}

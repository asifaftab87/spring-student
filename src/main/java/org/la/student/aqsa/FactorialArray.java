package org.la.student.aqsa;

import java.util.Scanner;

public class FactorialArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		fact(a);

}
	static void fact(int[] a) {
		for(int i=0;i<10;i++) {
			int fact=1;
			for(int j=a[i];j>0;j--) {
			fact=fact*j;
			}
			System.out.println(fact);
		}
		
	}
}
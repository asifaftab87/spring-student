package org.la.student.aqsa;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		System.out.print(smallestElement(a));
		}
		static int smallestElement(int[] a) {
			int smallest=a[0];
			for(int i=1;i<a.length;i++) {
				if(smallest>a[i]) {
					smallest=a[i];
				}
			}
			return smallest;
		}

}

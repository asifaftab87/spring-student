package org.la.student.aqsa;
import java.util.*;
public class Greatest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		System.out.print(greatestElement(a));
		}
		static int greatestElement(int[] a) {
			int greatest=a[0];
			for(int i=1;i<a.length;i++) {
				if(greatest<a[i]) {
					greatest=a[i];
				}
			}
			return greatest;
		}

}

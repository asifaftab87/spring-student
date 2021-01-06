package org.la.student.aqsa;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[] a= new int[10];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	                            }
	sc.close();
	reverse(a);
	                                       }
	static void reverse(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}

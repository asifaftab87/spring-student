package org.la.student.kayes.Array;

public class Q12 {

	public static void main(String[] args) {
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		
		for(int i=b.length-1;i>=0;i--)
			System.out.println(b[i]);

	}

}

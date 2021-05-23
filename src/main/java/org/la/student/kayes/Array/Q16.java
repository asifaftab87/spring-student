package org.la.student.kayes.Array;

public class Q16 {

	public static void main(String[] args) {
		int s=0;
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		int b[]= new int[a.length];
		
		
		for(int i=a.length-1;i>=0;i--)
		{
			b[s]=a[i];
			s++;
		}
		for(int i=0;i<a.length;i++)
			a[i]=b[i];
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}

}

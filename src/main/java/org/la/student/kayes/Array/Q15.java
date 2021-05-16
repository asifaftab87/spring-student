package org.la.student.kayes.Array;

public class Q15 {

	public static void main(String[] args) {
		int k=0;
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<=a[1+1])
				k=a[i];
			}
		System.out.println("The smallest number is"+k);


	}

}

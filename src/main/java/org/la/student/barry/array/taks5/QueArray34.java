package org.la.student.barry.array.taks5;

import java.util.Arrays;

public class QueArray34 {
//   Find largest and smallest elements of an array
	public static void main(String[] args) {
		
		int large,small,i;
		int a[] = new int[]{1, 2, 3, 4, 5};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];

		if(a[i]<small)
		small=a[i];
		}

		System.out.print("\nThe smallest element is " + small );
		System.out.print("\nThe largest element is "  + large );
	    }
}
 

package org.la.student.kayes.Array;

public class Q27 {

	public static void main(String[] args) {
		int k=66,n=0;
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,66,88};
		for(int i=0;i<a.length;i++)
		{
			n++;
			if(a[i]==k)
			{
				System.out.println("The number is found in the array at position number"+n);
				
			}
		}


	}

}

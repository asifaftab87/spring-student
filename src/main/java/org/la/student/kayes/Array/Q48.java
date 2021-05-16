package org.la.student.kayes.Array;

public class Q48 {

	public static void main(String[] args) {
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,111,77,88};
		int n=0,r,k=0;
		for( int i=0;i<a.length;i++)
		{
			n=a[i];
			while(n!=0)
			{
				
				r=n%10;
				if(r==2)
					k++;
				n=n/10;
			}
			n=0;
		}
		System.out.println("THE NUMBER OF 2's in an array is    "+k);


	}

}

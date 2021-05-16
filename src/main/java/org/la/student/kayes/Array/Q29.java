package org.la.student.kayes.Array;

public class Q29 {

	public static void main(String[] args) {
		int k=1,n=10;
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		System.out.println(a.length);
		for(int i=a.length-1;i>n-1;i--)
		{
			a[i+1]=a[i];
		}
		a[n]=k;
		/*for(int i=n+1;i>a.length+1;i++)
		{
			a[i]=a[i+1];
		}*/
		for(int i=0;i<n;i++)
		{
				System.out.println(a[i]);
		}


	}

}


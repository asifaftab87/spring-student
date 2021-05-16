package org.la.student.kayes.Array;

public class Q28 {

	public static void main(String[] args) {
		int k=54,n=0,s=0;
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		for(int i=0;i<a.length;i++)
		{
			n++;
			if(a[i]==k)
			{
				s=n;
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==(s-1))
				continue;
			else
				System.out.println(a[i]);
		}


	}

}

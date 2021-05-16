package org.la.student.kayes.Array;

public class Q22 {

	public static void main(String[] args) {
		
		int a[]= {5,4,3,7,2};
		for(int i=0;i<a.length;i++)
		{
			int f=1;
			for( int j=1;j<=a[i];j++)
			{
				f=f*j;
			}
			System.out.println("Factorial of"+a[i]+"="+f);
			
		}

	}

}

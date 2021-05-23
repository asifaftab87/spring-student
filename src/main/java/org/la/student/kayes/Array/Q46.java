package org.la.student.kayes.Array;

public class Q46 {

	public static void main(String[] args) {
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				s=s+a[i];
		}
		
		System.out.println("SUM OF ALL ODD NUMBER IS	"+s);



	}

}

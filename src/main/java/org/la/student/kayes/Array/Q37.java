package org.la.student.kayes.Array;

public class Q37 {

	public static void main(String[] args) {
		int a[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
			
				
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
		}
		
		

	}

}

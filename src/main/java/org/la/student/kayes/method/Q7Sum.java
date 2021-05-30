package org.la.student.kayes.method;

public class Q7Sum {
	static int sum(int k[])
	{
		int c=0;
		for(int i=0;i<k.length;i++)
		{
			c=c+k[i];
		}
		return c;
		}

	public static void main(String[] args) {
		int arr[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		int s=sum(arr);
		System.out.println("Sum of the array elements is	"+s);
	}
}

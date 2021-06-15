package org.la.student.kayes.method;

public class Q2Positive {
	static void printPositive(int k[])
	{
		for(int i=0;i<k.length;i++)
		{
			if(k[i]>0)
				System.out.println(k[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {-10,5,-4,3,-2,54,56,-43,33,-22,-11,66,77,-88};
		printPositive(arr);

	}

}

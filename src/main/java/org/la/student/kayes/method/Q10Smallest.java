package org.la.student.kayes.method;

public class Q10Smallest {
	static int smallest(int k[])
	{
		int temp=10;
		for(int i=0;i<k.length;i++)
		{
			if(k[i]<temp)
				temp=k[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int arr[]= {10,5,4,3,2,54,56,100,43,33,22,11,66,77,88};
		int s=smallest(arr);
		System.out.println("Smallest number in the array is		"+s);

	}



}

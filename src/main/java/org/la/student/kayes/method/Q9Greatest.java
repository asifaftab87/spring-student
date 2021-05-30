package org.la.student.kayes.method;

public class Q9Greatest {
	static int greatest(int k[])
	{
		int temp=0;
		for(int i=0;i<k.length;i++)
		{
			if(k[i]>temp)
				temp=k[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int arr[]= {10,5,4,3,2,54,56,100,43,33,22,11,66,77,88};
		int s=greatest(arr);
		System.out.println("Greatest number in the array is		"+s);

	}


}

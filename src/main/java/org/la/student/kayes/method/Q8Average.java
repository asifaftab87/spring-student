package org.la.student.kayes.method;

public class Q8Average {
	static float average(int k[])
	{
		float c=0;
		float a=0;
		for(int i=0;i<k.length;i++)
		{
			c=c+k[i];
			a=c/k.length;
			
		}
		return a;
		}

	public static void main(String[] args) {
		int arr[]= {10,5,4,3,2,54,7};
		float s=average(arr);
		System.out.println("Average of the array elements is	"+s);
	}

}

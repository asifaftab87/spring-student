package org.la.student.noura.array;

public class PrintOnlyEvenNumberfromArray {

	public static void main(String[] args) {
//wap to print only even number from an array

		int a[]= {2,9,3,9,0,14,45,66,5,4,3,4};
		
		
		System.out.println("Even Numbers:");

		for (int k=0;k<a.length;k++)
		{
			if(k%2==0)
			{
				System.out.println(a[k]);
			}
		}
	}

}

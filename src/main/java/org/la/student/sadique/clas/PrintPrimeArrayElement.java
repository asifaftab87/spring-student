package org.la.student.sadique.clas;

public class PrintPrimeArrayElement {

	public static void main(String[] args) {
		// wap to print all prime numbers from an array.
		int arr[] = {15, 43, 6, 41, 54, 71 };
		int nf, i, j, n;
		System.out.println("Print prime numnber");
		for (i = 0; i < arr.length; i++) 
		{
			n = arr[i];
			nf = 0;
			for (j = 1; j <= n; j++) 
			{
				if (n % j == 0) 
				{
					nf++;
				}
			}
			if (nf == 2) {
				System.out.print(n +" ");
			}
		}

	}

}

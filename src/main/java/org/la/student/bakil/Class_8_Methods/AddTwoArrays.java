package org.la.student.bakil.Class_8_Methods;
/*
 * int[] addTwoArrays(int[], int[]) - all array of same size
		add two supplied arrays elements and then copy the some of each element to 3rd array and 
		return 3rd array.
 */
public class AddTwoArrays {


	public static void main(String[] args) {
		int[]a={6,2,3};
		int b[]={4,5,6};
		int[]e={16,2,3};
		int d[]={14,25,6};
		System.out.println("The sum of two arrays are :");
		addTwoArrays(a,b);
		System.out.println("The sum of two arrays are :");
		addTwoArrays(e,d);
		
		 }

	
	 static int[] addTwoArrays(int[]a, int[]b) {
		 int c[]=new int[a.length];
			for(int i=0;i<=a.length-1;i++)

			{

			c[i]=a[i]+b[i];

			}
			for( int j=0;j<=c.length-1;j++)
			{

			System.out.print(c[j]+"  ");
		}
			return c;
	 
	 }
	}


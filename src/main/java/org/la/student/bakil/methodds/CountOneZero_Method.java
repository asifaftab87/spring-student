package org.la.student.bakil.methodds;
/*
 * int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
		create an array having the count of zero and one in given array, 
		return zero and one count array.
		e.g the return array having r[] = {3, 4}
		a[] = {1,0,1,0,0,1,1}; - this array having 3 zeros and 4 ones
 */
public class CountOneZero_Method {

	public static void main(String[] args) {
		
		 int arr[] = {1,0,1,0,0,1,1,0,1};
		 int i=count(arr);
		 System.out.println("number Zero  in arrays : "+i);
		 

	}
	
		static int count(int a[])
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==0)
					count++;
			}
			return count;
		}

		

		}

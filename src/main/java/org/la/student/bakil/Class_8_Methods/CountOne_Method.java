package org.la.student.bakil.Class_8_Methods;
/*
 * count number of times one in array and return count
	int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
 */
public class CountOne_Method {

	public static void main(String[] args) {
		
		 int arr[] = {1,0,1,0,0,1,1,0,1};
		 int i=count(arr);
		 System.out.println("number One  in arrays : "+i);
		 

	}
	
		static int count(int a[])
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==1)
					count++;
			}
			return count;
		}

		

		}

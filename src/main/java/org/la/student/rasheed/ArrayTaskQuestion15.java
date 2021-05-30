package org.la.student.rasheed;
/*
 * wap to find smallest number among array element
 */

public class ArrayTaskQuestion15 {

	public static void main(String[] args) {
		
		int arr [] = {10, 20, 550, 40, 5000 ,30};
		int x, test =arr[0];
		for (int i=0; i<arr.length;  i++)
		{
			x=arr[i];
			if (test>x) test =x;
		}
		System.out.println("smallest number is "+test);
		
			
	}
	

}




package org.la.student.barry.array.taks5;

public class QueArray7 {
// )wap to print only negative number from an array

	public static void main(String[] args) {
		int i = 0;
		int[] positive_arr = {11, -8, 3, 10, -9, -15, 21, 17, -31, -66, 65, 81, -56, 100};	
		
		System.out.print("List of negative Numbers in negative Array : ");
		while(i < positive_arr.length) 
		{
			if(positive_arr[i] <= 0) {
				System.out.format("%d ", positive_arr[i]);
			}
			i++;
		}    }
 }

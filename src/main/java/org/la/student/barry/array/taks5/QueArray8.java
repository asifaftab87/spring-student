package org.la.student.barry.array.taks5;

public class QueArray8 {
// ) wap to print number divisible by given number from an array

	public static void main(String[] args) {
		int i = 0;
		int[] div_arr = {11, 8, 3, 10, 9,15, 21, 17, 31, 66, 65, 81, 56, 100};	
		
		System.out.print("List of Numbers divisible in  Array : ");
		for(;i < div_arr.length;i++) 
		{
			if(div_arr[i]%3== 0) {
				System.out.println(div_arr[i]);
			}
			
		}    }
 }

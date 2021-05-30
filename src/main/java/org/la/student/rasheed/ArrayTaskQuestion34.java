package org.la.student.rasheed;
/*
 * wap to remove all zero element from an array?
 */


public class ArrayTaskQuestion34 {

	public static void main(String[] args) throws Exception {
		int [] array_nums = {0, 1, 0, 3, 0, 4, 0, 5, 6, 0, 7, 0, 8};
		int i = 0;
		
		System.out.print("\nOriginal array: \n");
		
		for (int n : array_nums)
			System.out.print(n+"  ");
			
		for (int j = 0, l = array_nums.length; j < l;) {
			if (array_nums[j] == 0)
				j++;
			else {
				int x = array_nums[i];
				array_nums[i] = array_nums[j];
				array_nums[j] = x;
				i ++;
				j ++;
			}
		}
		while (i < array_nums.length)
			array_nums[i++] = 0;
		System.out.print("\nMove 0's to end of the array: \n");
		for (int n : array_nums)
			System.out.print(n+" ");
		System.out.print("\n");
		

		

	}

}

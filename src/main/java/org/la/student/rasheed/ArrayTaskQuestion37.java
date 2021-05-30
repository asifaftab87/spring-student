package org.la.student.rasheed;

/*
 * rite a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers ?
 */
import java.util.Arrays;

public class ArrayTaskQuestion37 {

	public static void main(String[] args) {
		
		int nums [] = {50, 933, 10, 4, 7, 9, 11, 22, 66, 71, 93};
		int result[];
		
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(nums));
	
		result = seperate_odd_even(nums);
		
		System.out.println("Array seperation ");
		System.out.println(Arrays.toString(result));
	}
	
	static int [] seperate_odd_even(int array[]) {
		int left_side = 0, right_side = array.length - 1;
		while (left_side < right_side) {
			
			while (array[left_side]%2 == 0 && left_side < right_side)
                left_side++;
 
            while (array[right_side]%2 == 1 && left_side < right_side)
                right_side--;
 
            if (left_side < right_side)
            {
                int temp = array[left_side];
                array[left_side] = array[right_side];
                array[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        return array;
		}
		

	}



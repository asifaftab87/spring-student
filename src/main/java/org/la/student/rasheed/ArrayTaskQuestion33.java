package org.la.student.rasheed;

import java.util.Arrays;

/*
 * Write a Java program to find the second smallest element in an array?
 * 
 */

public class ArrayTaskQuestion33 {

	public static void main(String[] args) {
		
int array [] = {10, 33, 0, 100, 45, 77, 89, 99,  200};
		
		System.out.println("Orgignal numeric array : "+Arrays.toString(array));
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==min) {
				second_min =min;
			}
			else if (array[i] < min) {
			second_min = min;
			min = array [i];
			}
			else if (array [i] < second_min) { 
			second_min = array [i];
			}
			
			
		}
		System.out.println("the second smallest number is: "+second_min);

	}
	}



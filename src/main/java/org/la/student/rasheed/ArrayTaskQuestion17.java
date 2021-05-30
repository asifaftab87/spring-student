package org.la.student.rasheed;
/*
 * wap to copy two arrays into one array
 */

public class ArrayTaskQuestion17 {

	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5, 6};
		int b [] = {7,8, 9, 10, 11};
		int c [] = new int [a.length+b.length];
		int count = 0;
		
		for (int i=0; i<a.length; i++) {
			c [i] = a[i];
			count++;
		}
		for (int j = 0; j< b.length; j++) {
			c[count++] = b[j];
		}
		for (int i =0; i< c.length; i++)
		System.out.println(c[i]+" ");

	}

}

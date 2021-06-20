package org.la.student.rasheed.method;
/*
 * create an array and copy supplied array and return that new array
 */
import java.util.Arrays;

public class MethodTask7 {

	public static void main(String[] args) {
		int a [] = {1, 3, -4, 5, 6, -9};
		int b[] = copy(a);
		System.out.println(Arrays.toString(b));
		
		}
	static int [] copy (int[]  a) {
		int b [] = new int[a.length];
		System.out.println("coping array");
		
		for (int i=0; i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
		
		
			}
	}

	

		
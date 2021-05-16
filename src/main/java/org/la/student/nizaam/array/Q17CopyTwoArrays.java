package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q17CopyTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	17) wap to copy two arrays into one array
		
		int a1[]= {12,3,4},a2[]= {5,6,7,8};
		int a3[]= new int[a1.length+a2.length];
		
		System.arraycopy(a1, 0, a3, 0, a1.length);
		System.arraycopy(a2, 0, a3, a1.length, a2.length);
		System.out.println(Arrays.toString(a3));
		
		}
	}



package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array29InsrtAnElementIntoSpcPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {1,2,3,4,3,7,9,5}, num=6,pos=7;
		
		int b[]= new int[a.length+1];
		
		System.arraycopy(a, 0, b, 0, pos-1);
				
		b[pos-1]=num;
		System.arraycopy(a, pos-1, b, pos, a.length+1-pos);
		
		System.out.println(Arrays.toString(b));
		 }
	}

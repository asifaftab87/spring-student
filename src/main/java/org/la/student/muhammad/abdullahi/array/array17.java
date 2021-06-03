package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,3,4};
		int b[]= {5,6,7,8};
		int c[]= new int[a.length+b.length];
		
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		
		System.out.println(Arrays.toString(c));
		
		}

	}


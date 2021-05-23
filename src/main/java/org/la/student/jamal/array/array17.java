package org.la.student.jamal.array;

import java.util.Arrays;

public class array17 {
	
	//	17) wap to copy two arrays into one array

	public static void main(String[] args) {
		
	
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int f=a.length;
		int s=b.length;
		
		int [] re= new int [f+s];
		
		System.arraycopy(a,0,re,0,f);
		System.arraycopy(b, 0, re, f, s);
		System.out.println(Arrays.toString(re));
		
		
		
		
	}

}

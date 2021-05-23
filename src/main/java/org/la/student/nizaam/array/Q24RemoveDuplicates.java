package org.la.student.nizaam.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q24RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	24) Write a java program to remove duplicate elements from an array?
		int a[]= {1,2,3,2,2,1,2,3,4,3,2,1};
		Arrays.sort(a);
		int count,num;
		
		int b[]=new int[a.length];
		int index=0;
		for(int x=0;x<a.length;x++) {
			while(x<a.length-1 && a[x]==a[x+1])
				x++;
			b[index]= a[x];
			index++;
		}
		
		int c[] = new int[index];
		System.arraycopy(b, 0, c, 0, index);
		System.out.println(Arrays.toString(c));
	}

}

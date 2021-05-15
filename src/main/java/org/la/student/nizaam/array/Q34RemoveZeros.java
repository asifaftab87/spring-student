package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q34RemoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	34) wap to remove all zero element from an array?
		
		int a[]= {0,1,0,3,4,0,5,0,6,3},index=0;
		
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[index]=a[i];
				index++;
			}
		}
		int[] c= new int[index];
		
		System.arraycopy(b, 0, c, 0, index);
		System.out.println(Arrays.toString(c));
		
	}

}

package org.la.student.sajid;

public class Array34 {
	public static void main(String[] args) {
//		34) wap to remove all zero element from an array?
		int[] a = {0, 5, 6, 0, 0, 2, 5};
        for(int i=0;i<a.length;i++) {
        	if(a[i]!=0) {
        		System.out.print(a[i]+" ");
        	}
        }
	}

}

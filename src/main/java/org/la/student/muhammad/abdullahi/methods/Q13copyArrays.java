package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q13copyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,5};
		int b[]= {1,2,1,4};
		int c[]= CopyArrays(a,b);
		
		System.out.println(Arrays.toString(c));
		
		
			
		
			
		
	}	
	static int[]  CopyArrays(int[]a,int []b) {
	int c[]=  new int[a.length+b.length];
	
     int i;	
		for( i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int x=0;x<b.length;x++,i++) {
			c[i]=b[x];
		}
		return c;
	}

}
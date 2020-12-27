package org.la.student.noura.array;

public class CopytwoArraysintoneArray {

	public static void main(String[] args) {
		//wap to copy two arrays into one array
		
		
		
		//by using 2 different variables i and x
		
		
		int a[]= {1,2,3,4,5};
		int b[]= {-1,-2,-3,-4,-5};
		int c[]=new int [a.length+b.length];
		int i=0;//declaring i outside the for block bcz we want to reach i variable after for loop
		for(;i<a.length;i++) {
			
			c[i]=a[i];
		}
		for (int x=0;x<b.length;x++) {
			c[i]=b[x]; // to maintain the location of c we write c[i] instead of c[x]
			i++;
		}
		
		for(int y=0; y<c.length;y++)
		System.out.print(c[y]+" ");
		
		

	}

}

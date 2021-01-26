package org.la.student.asif.array;

public class Copy3 {

	public static void main(String[] args) {
		
		int[] a = {22, 12, 0, 1};	//4
		int b[] = {2, 3, -1};		//3
		
		int c[] = new int[a.length + b.length];
		
		int i=0;
		for( ; i<a.length ; i++) {
			c[i] = a[i];
		}
		
		for(int x=0 ; x<b.length ;x++) {
			c[i] = b[x];
			i++;
		}
		
		System.out.print("array c length: "+c.length+"\n");
		for(int y=0; y<c.length ; y++) {
			System.out.print(c[y]+" ");
		}
		
		
	}
}

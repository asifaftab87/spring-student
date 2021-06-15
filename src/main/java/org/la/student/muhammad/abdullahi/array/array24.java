package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,2,2,1,2,3,4,3,2,1};
		Arrays.sort(a);
		
		
		int b[]=new int[a.length];
		int y=0;
		for(int x=0;x<a.length;x++) {
			while(x<a.length-1 && a[x]==a[x+1])
				x++;
			b[y]= a[x];
			y++;
		}
		
		int c[] = new int[y];
		System.arraycopy(b, 0, c, 0, y);
		System.out.println(Arrays.toString(c));

		}
	}

package org.la.student.noura.array;

public class ReverseAnArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		for (int i=0,b=a.length-1;i<b;i++,b-- ) {
			int t=a[i];
			a[i]=a[b];
			a[b]=t;			
		}

		
		for(int z=0;z<a.length;z++) 
			System.out.println(a[z]);
			
	}

}

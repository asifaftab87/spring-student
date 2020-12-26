package org.la.student.noura.array;

public class ReverseArray {

	public static void main(String[] args) {
		// wap to reverse an array
		
		int a[]= {1,2,3,4,5};
		
		
		for (int i=0, d=a.length-1;i<d;i++,d--) {
			
			int t=a[i];
			a[i]=a[d];
			a[d]=t;
		}
		for(int i=0;i<a.length;i++) {

			System.out.print(" "+a[i]);
		}


	}

}

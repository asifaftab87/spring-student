package org.la.student.tahir.array;

public class Printonlynegativenumberfromanarray {

	public static void main(String[] args) {
		// wap to print only negative number from an array
		

		int[] a = new int[30];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]= i* -2;
			if(a[i] < 0) {
				System.out.println(a[i]);
			}

	}

}
}
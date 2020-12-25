package org.la.student.tahir.array;

public class Printarrayinreverseorder {

	public static void main(String[] args) {
		// wap to print array in reverse order
		
	int[] a = new int[4];
		
		for(int i=a.length -1; i>=0; --i) {
			
			a[i]= i*10;
			
			System.out.println("a["+i+"] = " +a[i]);
		}
		
	}

}

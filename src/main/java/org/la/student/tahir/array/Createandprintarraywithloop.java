package org.la.student.tahir.array;

public class Createandprintarraywithloop {

	public static void main(String[] args) {
		// wap to create and print array using with loop
		
		int[] a = new int[4];
		
		for(int i =0; i<a.length; i++) {
			
			a[i]= i*10;
			
			System.out.println("a["+i+"] = " +a[i]);
		}
		
		
		


	}

}

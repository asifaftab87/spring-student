package org.la.student.tahir.array;

public class Copyonearrayinsideotherarray {

	public static void main(String[] args) {
		// wap to copy one array into other array
		
		int[] a = new int[10];
		int[] b = new int [a.length];
		
		for(int i =0; i<a.length; i++) {
			
			a[i]= i;
			 b[i] =a[i] ;
		}
		
		System.out.println("Array a");
		
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);}
		
		
		System.out.println("Array b");
		
		for(int i=0; i<b.length; i++){
				
			System.out.println( b[i]);
			
			}
			
		

	}

}

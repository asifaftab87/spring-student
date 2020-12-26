package org.la.student.tahir.array;

public class Copyanarraytoanotherarrayinreverseorder {

	public static void main(String[] args) {
		// wap to copy an array to another array in reverse order
		
		int[] a = new int[10];
		int[] b = new int [a.length];
		
		for(int i=a.length-1; i>=0; --i) {
			
			a[i]= i;
			 b[i] =a[i] ;
		}
		
		System.out.println("Array a");
		
		for(int i=a.length-1; i>=0; --i) {
			System.out.println(a[i]);}
		
		
		System.out.println("Array b");
		
		for(int i=b.length-1; i>=0; --i){
				
			System.out.println( b[i]);
			
			}

	}

}

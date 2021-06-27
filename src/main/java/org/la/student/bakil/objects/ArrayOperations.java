package org.la.student.bakil.objects;
/*
 * create a class ArrayOperation and add methods like int[] copy(int[] a), int[] reverse(int[] b), 
	    int[] addTwoArrays(int[] a, int[] b), void print(int[] p), int sumArray(int a[]), 
	    int findMax(int[] a), int findMin(int[] a), int countNegative(int a[]), int countPositive(int a[]), 
 */
public class ArrayOperations {


	public int[] copy1(int[] a){
		int[] t = new int[a.length];
		for(int i=0 ; i<t.length ; i++) {
			t[i] = a[i];
		
	}
		return t;
	}
	
	public void print(int a[]) {
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public  int[] reverse(int [] x) {
		   System.out.println("Original Array:");
		    for(int i=0;i<x.length;i++)
		         System.out.print(x[i] + "  ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=x.length-1;i>=0;i--)
		         System.out.print(x[i] + "  ");
				return x;
		
	}
	
	}


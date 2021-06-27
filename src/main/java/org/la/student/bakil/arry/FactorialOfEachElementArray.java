package org.la.student.bakil.arry;
/*
 * wap to print all prime numbers from an array ?
 */
public class FactorialOfEachElementArray {

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5};

	   for (int i=0;i<a.length;i++) {
		   int f=1;
		   int n =a[i];
		   for (;n>0;) {
			   f=f*n;
			   n--;
		   }
		   System.out.println("Factorial of  " +a[i]+" is :"+f);
	   }
	}
	}
package org.la.student.sajid;

public class Array28 {
	public static void main(String[] args) {
//		28) Write a Java program to remove a specific element from an array?
		int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		int removed=10;
		for(int i = 0; i < a.length; i++){
	      if(a[i]!=removed) {
	    	  a[i]=a[i];
	    	  System.out.print(a[i]+" ");
	      }
	    }
	}

}

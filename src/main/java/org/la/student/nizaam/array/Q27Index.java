package org.la.student.nizaam.array;

public class Q27Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	27) Write a Java program to find the index of an array element(here u have to take any number and check that number is present inside an array or not, 
	    if 	not print -1, if present then print its index means of of that element)?
		 */
		
		int a[]= {1,2,3,4,5},value=4,index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				index=i;
				break;
			}
		}
		System.out.println(index);

	}

}

package org.la.student.jamal.array;

public class array27 {
	
	//Write a Java program to find the index of an array element(here u have to take any number and check that number is present inside an array or not, 
    // if 	not print -1, if present then print its index means of of that element)?

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5},value=10,index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		
		

	}

}

package org.la.student.sajid;

public class Array27 {
	public static void main(String[] args) {
//		27) Write a Java program to find the index of an array element(here u have to take any number and check that number is present inside an array or not,
		
		int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		
		int check=11;
		for(int i=0;i<a.length;i++) {
			if(check==a[i]) {
				System.out.println("Yes: That Number is Present "+a[i]);
			}
		}
		
	}

}

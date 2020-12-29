package org.la.student.sajid;

public class Array23 {
	public static void main(String[] args) {
//		23) Write a java program to count occurrences of each element in an array?
		 
		int a[]= {1,1,1,1,2,2,2,5,3,3,3,4,4,4,4,4,4};
		int x=4,f=0;
		for(int i=0;i<a.length;i++) {
			if(x==a[i]) {
				f++;
			}
		}System.out.println(f);
	}

}

package org.la.student.sajid;

public class Array19 {
	public static void main(String[] args) {
//		19) Write a java program to find duplicate elements in an array? 
		int a[]= {1,12,5,12,5,3,5,51,1,2};
		for(int i=0;i<a.length;i++) {
			for(int b=i+1;b<a.length;b++){
				if(a[i]==a[b]) {
					System.out.print(a[i]+" ");
				}
			}
			
		}
	}

}

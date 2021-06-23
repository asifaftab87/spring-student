package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q11SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,200,4,8,100};
		int smallest= SmallestNum(a);
		
		System.out.println(smallest);
		
		
	
}
	
	
	static int SmallestNum(int []a) {
		int n=10 ;
		for(int i=0;i<a.length;i++) {
			 
		if(a[i]<n) {
			n=a[i];
		}
			
			
		}
		
		return n;
		
}
}
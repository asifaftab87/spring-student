package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q10greatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,200,1,4,8,100};
		int greatest= greatestNum(a);
		
		System.out.println(greatest);
		
		
	
}
	
	
	static int greatestNum(int []a) {
		int n=0 ;
		for(int i=0;i<a.length;i++) {
			 
		if(a[i]>n) {
			n=a[i];
		}
			
			
		}
		
		return n;
		
}
}
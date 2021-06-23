package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q8average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[]= {2,3,1,6,4,10};
		
		double avg = avg(a);
		System.out.println(avg);
	
}
	
	
	static double avg(double []a) {
		double n=1 ;
		for(int i=0;i<a.length;i++) {
			 
			n +=a[i];
			
			
		}
		
		return n/a.length;
}
}
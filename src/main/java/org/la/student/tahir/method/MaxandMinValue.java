package org.la.student.tahir.method;

public class MaxandMinValue {
	//Max and Min Values
	public static void main(String[] args) {
		
		
	
		System.out.println("Maximum value is: "+max());
		System.out.println("Minimum value is: "+min());
	}

	



static int max() {
	
	int a[]= {25,11,35,65,20};
	int max=a[0];
	int i=0;
	for (;i<a.length;i++) {

		if (a[i]>max) {
			max=a[i];
			
		}
		
	}
	
	
	return max;
	

	
}

static int min() {
	
	int a[]= {25,11,35,65,20};
	int min=a[0];

	for (int i=0;i<a.length;i++) {

		if (a[i]<min) {
			min=a[i];
			
		}
		
	}
	return min;

	
}}


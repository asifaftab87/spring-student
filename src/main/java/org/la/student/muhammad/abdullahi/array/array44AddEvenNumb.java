package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array44AddEvenNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	int x[]= {3,10,5,8,7};	
		
	int sum=0;
		for(int i=0;i<x.length;i++) {
		if(x[i]%2==0) {
			
			sum+=x[i];
		
		}
		}
		
		System.out.println(sum);
		
	}
	}

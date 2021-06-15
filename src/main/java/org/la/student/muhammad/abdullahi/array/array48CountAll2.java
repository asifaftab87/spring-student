package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array48CountAll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	int x[]= {2,3,2,10,5,8,2,1,7,1};	
		
	int sum=0;
		for(int i=0;i<x.length;i++) {
		if(x[i]==2) {
			sum+=x[i];
		}
		
		}	
		System.out.println(sum);
	}
	}

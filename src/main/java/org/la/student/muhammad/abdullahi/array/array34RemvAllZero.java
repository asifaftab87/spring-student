package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array34RemvAllZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 int a []= {0,2,5,1,0,7,8};
		 Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				continue;
			}
			
		System.out.println(a[i]);
		 
		}
		
		
	
		
	}
	}

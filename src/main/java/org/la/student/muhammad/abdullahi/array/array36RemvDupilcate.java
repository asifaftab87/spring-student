package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array36RemvDupilcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a[]= {1,2,3,2,2,1,2,3,3,2,1};
		Arrays.sort(a);
		
		int index=0;
		for(int x=0;x<a.length;x++) {
			while(x<a.length-1 && a[x]==a[x+1])
				x++;
			
			index++;
		}
		System.out.println(index);
		 
		
		
		
	
		
	}
	}

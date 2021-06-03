package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array35Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 int a []= {-2,5,1,7,8};
		 Arrays.sort(a);
		
		boolean bool=false;
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]==0|| a[i]==-1) {
			
			bool=true;
		}
		}
		if(bool) {
			System.out.println("there is 0 and -1");
		}
		else {
			System.out.println("there is NO 0 and -1");
		}
			
		 
		
		
		
	
		
	}
	}

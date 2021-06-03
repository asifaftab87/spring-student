package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int a[]= {1,2,3,4};
        boolean bool=true;
        int m;
	for(int i=0;i<a.length;i++) {
			
			m=a[i]/2;
			bool=true;
			for(int j=2;j<=m;j++) {
				if(a[i]%j==0) {
					bool=false;
					break;
				}
			}
			
			if(bool)
				System.out.println(a[i]);
		}
		
		
		
	
		
		

		}
	}

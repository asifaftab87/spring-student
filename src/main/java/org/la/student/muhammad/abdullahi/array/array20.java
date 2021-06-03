package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4};
		int b[]= {1,2,4};
		
		boolean bool=true;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				continue;	
			}
			else {
				bool=false;
				break;
			}
		}
			if(bool) 
				System.out.println("Equal array");
		       
			
			else { 
				System.out.println("Not equal");	
			}
		
					
		System.out.println("----end----");
		
		

		}
	}


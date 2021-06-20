package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,1,3,2,1,1,1};
		System.out.println(countOnes(a));
	
		
		
	}	
		 static int countOnes(int[] a) {
			int x=0;
			 for(int i=0;i<a.length;i++) {
				 if(a[i]==1)
					x++;
			 }
			 return x;
		}
		}
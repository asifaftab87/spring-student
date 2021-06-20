package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22CountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,0,1,0,0,1,1,0};
		System.out.println(countZeros(a));
	
		
		
	}	
		 static int countZeros(int[] a) {
			int x=0;
			 for(int i=0;i<a.length;i++) {
				 if(a[i]==0)
					x++;
			 }
			 return x;
		}
		}
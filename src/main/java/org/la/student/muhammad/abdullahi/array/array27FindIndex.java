package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array27FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a[]= {1,2,3,4,5},value=9,index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		
		
		
		}
	}

package org.la.student.tahir.array;

public class Equalitychecking {

	public static void main(String[] args) {
		// wap to check whether two array are equal or not(means we have to check each element of two arrays)
		
		int[] a= {1,2,4,4};
		int[] b= {1,2,3,4};
		
		boolean result = true;
		
		if(a.length == b.length) {
			
			for(int i=0; i<a.length; i++) {
				
				if( a[i] != b[i]) {
					
					result = false;
				}
			}
		}
		
		else 
			result= false;
		
		if(result == true)
			System.out.println("Array a and b are equal");
		
		else
			System.out.println("Array a and b are not equal");
		
		
			}
			
				
		}
		
	





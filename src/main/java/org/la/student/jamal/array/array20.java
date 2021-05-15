package org.la.student.jamal.array;

public class array20 {
	
	//	20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?

	public static void main(String[] args) {
		
	
		
		int a[]= {6,1,2,3,4,5,6,1};
		int b[]= {1,2,3,4,5,6};
		boolean bool=true;
		
		for( int i=0;i<a.length;i++) {
			if (a[i]==b[i]) {
				continue;
				
			}else {
				bool=false;
				break;
				
			}
		}
		if(bool) {
			System.out.println("it's equal ");
			
		}else {
			System.out.println("not equal");
		}
		
	}

}

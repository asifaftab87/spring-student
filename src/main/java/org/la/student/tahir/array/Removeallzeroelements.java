package org.la.student.tahir.array;

public class Removeallzeroelements {

	public static void main(String[] args) {
		// wap to Remove Specific elements

		int arr[]= {1,1,2,0,4,3,0,6,0};
		
		int len=arr.length;
		int zero = 0;
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]!= zero) {
				arr[i]=arr[i];
				
				System.out.print(arr[i]+" ");
			}
			
		}
		
		
		
		
	}

}

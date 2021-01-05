package org.la.student.tahir.array;

public class Removespecificelement {

	public static void main(String[] args) {
		// wap to Remove Specific elements

		int arr[]= {1,1,2,2,4,3,5,6,6};
		
		int len=arr.length;
		int spec = 6;
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]!= spec) {
				arr[i]=arr[i];
				
				System.out.print(arr[i]+" ");
			}
			
		}
		
		
		
		
	}

}

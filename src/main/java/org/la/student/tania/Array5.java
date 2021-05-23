package org.la.student.tania;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5, 4, 3, 6, 7, 111, 321, 131};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			int n = arr[i];
			
			int x;
			
			for(x=2 ; x<n ; x++) {
				if(n%x==0) {
					break;
				}
			}
			
			if(n==x) {
				System.out.println(n+" is a prime number");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
			
		}
	}

}

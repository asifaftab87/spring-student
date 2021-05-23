package org.la.student.noor;
// wap to print all prime numbers from an array ?
public class Array21 {

	public static void main(String[] args) {
		int arr[]= {3,5,6,9,111,121,131};
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int x;
			for(x=2;x<n;x++) {
				if(n%x==0) {
					break;
					
				}
			}
			if(n==x) {
				System.out.println(n+"is a prime number");
			}
			else {
				System.out.println(+n+"is not a prime number");
			}
				
		}
			

	}

}

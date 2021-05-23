package org.la.student.noor;
// wap to print number not divisible by given number from an array
public class Array09 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int num=2;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]%num!=0) {
	    		System.out.println(arr[i]+"is not divisible by"+num);
	    	}
	    }

	}

}

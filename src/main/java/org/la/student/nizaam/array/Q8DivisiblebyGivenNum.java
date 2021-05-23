package org.la.student.nizaam.array;

public class Q8DivisiblebyGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	08) wap to print number divisible by given number from an array
		
		int arr[]= {2,4,6,8,9},num=2 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%num==0)
				System.out.println(arr[i]+" divisible by "+ num);
		}
	}

}

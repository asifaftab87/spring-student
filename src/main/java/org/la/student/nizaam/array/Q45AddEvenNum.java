package org.la.student.nizaam.array;

public class Q45AddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		//	45) wap to add all even numbers of an array and print the sum
		
		int a[]= {1,2,3,4,5,6,7,8},sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}

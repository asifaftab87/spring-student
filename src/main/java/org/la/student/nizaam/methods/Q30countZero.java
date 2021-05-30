package org.la.student.nizaam.methods;

public class Q30countZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,0,1,0,0,1,1,0};
		System.out.println(Count1(arr));
	}

	static int Count1(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}
		}
		
		return count;
	}
}

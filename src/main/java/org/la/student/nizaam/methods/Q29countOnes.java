package org.la.student.nizaam.methods;

public class Q29countOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,1,3,2,1,1,1};
		System.out.println(Count1(arr));
	}

	static int Count1(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		
		return count;
	}
}

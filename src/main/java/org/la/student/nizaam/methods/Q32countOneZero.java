package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q32countOneZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,0,1,0,0,1,1};
		int res[] = CountOneZero(a);
		System.out.println(Arrays.toString(res));
	}
	
	static int[] CountOneZero(int arr[]) {
		int zero=0,one=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero+=1;
			}
			else if(arr[i]==1)
				one+=1;
		}
		int res[] = {zero,one};
		return res;
	}

}

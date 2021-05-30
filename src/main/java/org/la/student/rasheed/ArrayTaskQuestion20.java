package org.la.student.rasheed;
/*
 * wap to check whether two array are equal or not(means we have to check each element of two arrays)?
 */


public class ArrayTaskQuestion20 {

	public static void main(String[] args) {
		int [] a = {7, 6, 5, 4};
		int [] b = {7, 6, 5, 4};
		boolean equalOrNot =true;
		if (a.length ==b.length) {
			for(int i=0; i<a.length; i++) {
				if (a[i] != b[i]) {
					equalOrNot = false;
				}
				
			}
		}
		else {
			equalOrNot =false;
		}
		if (equalOrNot) {
			System.out.println("Array are Equal");
		}
		else {
			System.out.println("Array not Equal");
		}

	}

}

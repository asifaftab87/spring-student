package org.la.student.sadique.clas;

public class CopyTwoArrayElementInThirdArray {

	public static void main(String[] args) {
		// wap to add two array elements n copy into third array.

		int arr1[] = new int[] { 2, 4, 6, 8 };
		int arr2[] = new int[] { 1, 3, 5, 7, 9, 11 };

		int len1 = arr1.length;
		int len2 = arr2.length;

		int result[] = new int[] { len1 + len2 };

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < len1 && j < len2) {

			if (arr1[i++] < arr2[j++]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}
		while (i < len1) {
			result[k++] = arr1[i++];
		}
		while (j < len2) {
			result[k++] = arr2[j++];
		}
		for (i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		for (i = 0; i < result.length; i++) {
			//System.out.println(result[i] + " ");
		}
		System.out.println(result[i] + " ");
	}
}
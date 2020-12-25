package org.la.student.tahir.array;
import java.util.Arrays;

public class Copytwoarraysintoonearray {

	public static void main(String[] args) {
		// Copy two arrays into one array
		
		int[] a = {6,4,566,4};
		int[] b = { 8, 9,4, 3};
		int arr1= a.length;
		int arr2= b.length;
		
		int[] c = new int[arr1 + arr2];
		
        System.arraycopy(a, 0, c, 0, arr1);
        System.arraycopy(b, 0, c, 0, arr2);

        System.out.println(Arrays.toString(c));

	
		
		
		
	}

}

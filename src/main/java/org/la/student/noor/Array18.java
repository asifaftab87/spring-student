package org.la.student.noor;
//wap to add two array elements n copy into third array
import java.util.Arrays;

public class Array18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5}, a2[]= {6,7,8,9,10};
		int[] a3 =new int[a2.length]; 

		for(int i=0;i<a2.length;i++) {
			a3[i]=a1[i]+a2[i];
		}
		System.out.println(Arrays.toString(a3));

}
}

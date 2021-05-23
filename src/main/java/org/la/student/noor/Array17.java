package org.la.student.noor;
//wap to copy two arrays into one array
import java.util.Arrays;
public class Array17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4},b[]= {5,6,7,8};
		int a1=a.length;
		int b1=b.length;
		
		int c1=a1+b1;
		int c[]= new int[c1];
		
		System.arraycopy(a,0,c,0,a1);
		System.arraycopy(b,0,c,a1,b1);
		
		System.out.println(Arrays.toString(c));

	}

}

package org.la.student.noura.array;

public class PrintoddNumberfromArray {

	public static void main(String[] args) {

//	04) wap to print only odd number from an array
		
		int a[]= {2,3,4,5,6,7,8,9};
		int o[]=a;
		for(int O=0;O<a.length;O++)
		{
			if (O%2!=0) {System.out.println(a[O]);}
		}
		System.out.println("size:"+o.length);
	}

}

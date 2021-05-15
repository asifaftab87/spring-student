package org.la.student.jamal.array;

public class array2 {

//02) wap to create and print array using loop
	public static void main(String[] args) {

		int a[]= {12,24,35,224,24};
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		for (int i:a) {
			System.out.println("this is for each :"+i);
			
		}
	}

}

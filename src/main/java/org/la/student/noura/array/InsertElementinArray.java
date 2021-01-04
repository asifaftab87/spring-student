package org.la.student.noura.array;

public class InsertElementinArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};
		int position=3;
		int element=100;
		for(int i=a.length-1;i>position-1;i--) {
			
			a[i]=a[i-1];
			
		}
		a[position-1]=element;
		for(int i=0;i<a.length;i++) {System.out.println(a[i]);}
	}

}

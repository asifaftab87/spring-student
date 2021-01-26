package org.la.student.noura.method;

public class Swap2Numbers {

	public static void main(String[] args) {
		//write java program to swap two numbers
		int a=4;		 
		int b=5;
		swap(a,b);

	}

	
	static void swap(int x, int y) {
		
		System.out.println("before swapping: "+x +"   "+ y);
		int s=x;
		x=y;
		y=s;
		System.out.println("after swapping: "+x+"   "+y);
	}
}

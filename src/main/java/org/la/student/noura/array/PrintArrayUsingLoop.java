package org.la.student.noura.array;

public class PrintArrayUsingLoop {

	public static void main(String[] args) {


		//wap to create and print array using loop

		
		int a[] =new int [30];
           for(int i =0;i<30;i++) {
			a[i]=2+i;
		
			
		}
		
		for(int i =0;i<30;i++) {
			
			System.out.println("a["+i+"]="+a[i]);
			
		}
		
		
	}

}

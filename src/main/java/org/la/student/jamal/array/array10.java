package org.la.student.jamal.array;

public class array10 {
	
	//10) wap to print array in reverse order

	public static void main(String[] args) {
		
		
		int a[]= {-1,2,3,4,-12,23,-35,-13,-24};
		 System.out.println("Original array: "); 
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int i=a.length-1;i>=0;i-- ) {
			
			System.out.print(a[i]+ " ");
		}
		
		

	}

}

package org.la.student.noura.array;

public class PrintArrayinReverseOrder {

	public static void main(String[] args) {
		//wap to print array in reverse order
		
		int []a= {1,2,3,4,5};
		System.out.println("orignal array: ");
		for(int k=0;k<a.length;k++) {
			System.out.print(" "+a[k]);
		}
		
		System.out.println();
			
		
		System.out.println("reverse array: ");
			
		        for (int i=a.length-1;i>=0;i--) {  

				System.out.print(" "+a[i]);
			}
		}
	}



package org.la.student.sadique.clas;

public class PrintEvenArrayNumber {

	public static void main(String[] args) {
		// 05) wap to print only even number from an array.
		int z[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int x=1;x<z.length;x++) {
			if(z[x]%2==0) {
				System.out.println(z[x]+" : even number");
			}
		}

	}

}

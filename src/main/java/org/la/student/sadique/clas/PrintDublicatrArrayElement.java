package org.la.student.sadique.clas;

public class PrintDublicatrArrayElement {

	public static void main(String[] args) {
		//  wap to add two array elements n copy into third array.
		int [] org = new int [] {1, 6, 3, 2, 5, 2, 6, 3};
		for(int i=0; i<org.length; i++) {
			for(int j=i+1; j<org.length; j++) {
				if(org[i]==org[j])
				System.out.println(org[j]);
			}
		}

	}

}

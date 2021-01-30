package org.la.student.noura.array;

public class PrinttheGreatestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,6,80};
		int g=a[0];
		for(int i =1;i<a.length;i++) {
			if (g<a[i]) 
			{
				g=a[i];
			}
		}
		System.out.println("The greatest value is "+g);

	}

}

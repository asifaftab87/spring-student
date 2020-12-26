package org.la.student.noura.array;

public class PrintonlypPositiveNumber {

	public static void main(String[] args) {
		//wap to print only positive number from an array
		
		
		int [] a= {2,45,7,89,4,555,-2,5,-65};
		
	System.out.println("positive number= ");
	
		for(int k=0;k<a.length;k++)
		{
			if (a[k]>0)
		
			System.out.println(a[k]);
		}

	}

}

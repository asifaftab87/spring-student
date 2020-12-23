package org.la.student.noura.array;

public class PrintonlyNegativeNumber {

	public static void main(String[] args) {
		
		int [] a= {2,45,7,89,4,555,-2,5,-65};
		
		System.out.println("NAGATIVE number= ");
		
			for(int k=0;k<a.length;k++)
			{
				if (a[k]<0)
			
				System.out.println(a[k]);
			}


	}

}

package org.la.student.noura.array;

public class PrintNumberDivisiblebygivenNumber {

	public static void main(String[] args) {
		//wap to print number divisible by given number from an array
		
		int a[]= {2,3,4,8,9,6,7,5,30};
		int d=3;
		System.out.println("Numbers divisible by  "+d+" :");
		for (int k = 0; k<a.length;k++) {
			
			if (a[k]%d==0) {
				System.out.println(a[k]);
			}
			
		}
		

	}

}

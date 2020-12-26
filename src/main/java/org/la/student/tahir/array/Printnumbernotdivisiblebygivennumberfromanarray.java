package org.la.student.tahir.array;

public class Printnumbernotdivisiblebygivennumberfromanarray {

	public static void main(String[] args) {
		// wap to print number divisible by given number from an array
		
				int[] a = new int[100];
				
				int n=3;
				
				for(int i=0; i<a.length; i++) {
					
					a[i]= i;
					if(a[i]%n != 0) {
						System.out.println(a[i]);
					}

	}

}
}

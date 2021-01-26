package org.la.student.noura.array;

public class PrintPrimeNumberofArrayElement {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,8,7,15,20,23};
		
		System.out.println("prime number are:");
		for (int i = 0; i <a.length; i++) {
            int j = 2;
            int p=1;
          
           while (j < a[i]) {
                if (a[i] % j == 0) {
                    p=0;
                    break;
                }
                j++;
            }
            if (p== 1) {
                System.out.print(" " + a[i]);
            }

	     }

       }
}

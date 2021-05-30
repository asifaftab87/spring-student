package org.la.student.rasheed;
/*
 * wap to print all prime numbers from an array 
 */
public class ArrayTaskQuestion21 {

	public static void main(String[] args) {
		int arr[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int num=0;
		String primeNumbers = "";
		for (int i=0; i<arr.length; i++) {
		
		int b =0;;
		for (num =i; num>=1; num--) {
			if (i%num==0) {
				
					b = b +1;
				}
			}
			if (b==2) {
				primeNumbers = primeNumbers +i+" ";
			}
			}
				System.out.println("prime number from given array: ");
				System.out.println(primeNumbers);
		
		}
		
	}
			
		

	



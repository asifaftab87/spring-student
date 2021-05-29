package org.la.student.bakil.Class_8_Methods;
/*
 * void printNegative(int[])
   method will print all negative number from supplied array
 */
public class PositiveNumber {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,-11};

		array (arr);
		

	}

		
		static void array (int arr[]) {
			for (int i=0;i<arr.length;i++) {
				if (arr[i]>0) {
				}
				else {
					System.out.println("The number is negative");
				}
				
				}
				for (int x :arr) {
					System.out.println("The positive number is :"+x);
			}
			
		}
	}



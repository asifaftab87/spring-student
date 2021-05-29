package org.la.student.bakil.Class_8_Methods;
/*
 * void printNegative(int[])
   method will print all negative number from supplied array
 */
public class NegativeNumber {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,-11};
		print(arr);
		int pos [] = positive(arr);
		print(pos);
	}



		static int [] positive(int x[]) {
			int c[] = new int [x.length];
			for (int i=0;i<x.length;i++) {
				
				if (x[i]>0) {
					
		
				}
					
				
					
				
			}
			return c;
			
			
		}


		 static void print(int[] arr) {
		for (int a:arr ) {
			System.out.println(a+" ");
		}
		 }
	}



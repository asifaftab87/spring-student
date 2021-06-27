package org.la.student.bakil.methodds;
/*
 * int smallest(int[])
		find smallest element of an array and return that smallest value
 */
public class SmallestNum_Method {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,11};
		smallest (arr);
		
		
		 }

	
	 static int smallest(int[] arr) {
		 int small = arr[0];
		 for (int num: arr) {
	            if(small > num) {
	                small = num;
	            }
	        }
		 System.out.println(small);
		 return small;

		}
	 
		
	}
	


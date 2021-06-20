package org.la.student.bakil.Class_8_Methods;
/*
 * int greatest(int[])
		find greatest element of an array and return that greatest value
 */
public class LargestNum_Method {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,11};
		greatest (arr);
	
		 }

	
	 static int greatest(int[] arr) {
		 int large = arr[0];
		 for (int num: arr) {
	            if(large < num) {
	                large = num;
	            }  	            
	        }
		 System.out.println(large);
		return large;
		
		}
	 
		
	}
	


package org.la.student.barry.array.taks5;

public class QueArray12 {
//  wap to copy an array to another array in reverse order

	
		// Function to print the array
		static void printArray(int arr[], int len)
		{
		    int i;
		    for (i = 0; i < len; i++)
		    {
		        System.out.printf("%d ", arr[i]);
		    }
		}
		 
		// Driver code
		public static void main(String[] args)
		{
		    int original_arr[] = {1, 2, 4, 5,6};
		    int len = original_arr.length;
		    int copied_arr[] = new int[len], i;
		     
		    // Copy the elements of the array
		    // in the copied_arr in Reverse Order
		    for (i = 0; i < len; i++)
		    {
		        copied_arr[i] = original_arr[len - i - 1];
		    }
		 
		    // Print the original_arr
		    System.out.printf("\nOriginal array: ");
		    printArray(original_arr, len);
		 
		    // Print the copied array
		    System.out.printf("\nResultant array: ");
		    printArray(copied_arr, len);
			
		}  
	}
 

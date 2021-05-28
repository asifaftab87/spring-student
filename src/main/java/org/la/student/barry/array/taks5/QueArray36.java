package org.la.student.barry.array.taks5;

public class QueArray36 {
	public static void main(String[] args) {	
		//wap to to divide each element of an array by 2.
	
     int[] array = {1, 5, 6, 12, 9, 0, 2, 6, 7}; 
 
		System.out.println("Sum: " + Calculate(array)); 
    } 
 
    public static int Calculate(int[] array) { 
        int sum = 0; 
 
        for (int i = 0; i < array.length; i++) { 
            if (array[i] % 2 == 0) { 
                sum += array[i]; 
            } 
        } 
         
        return sum; 
 }
}

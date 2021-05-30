package org.la.student.barry.array.taks5;

import java.util.Arrays;

public class QueArray17 {
// wap to copy two arrays into one array
	  public static void main(String[] args) {  
		  int[] firstArray = {32,43,22,68,4,80,1};        //source array  
		  int[] secondArray = {44,31,54,77,23,65,3};  //destination array  
		  int fal = firstArray.length;        //determines length of firstArray  
		  int sal = secondArray.length;   //determines length of secondArray  
		  int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		  System.arraycopy(firstArray, 0, result, 0, fal);  
		  System.arraycopy(secondArray, 0, result, fal, sal);  
		  System.out.println(Arrays.toString(result));    //prints the resultant array  
	        }  
		}  
 

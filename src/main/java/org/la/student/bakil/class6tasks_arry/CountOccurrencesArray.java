package org.la.student.bakil.class6tasks_arry;
/*
 * Write a java program to count occurrences of each element in an array?
 */
public class CountOccurrencesArray {

	public static void main(String[] args) {
	
		 int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};   
	        //Array fr will store frequencies of element  
	        int [] x= new int [arr.length];  
	        int visited = -1;  
	        
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    x[j] = visited;  
	                }  
	            }  
	            if(x[i] != visited)  
	                x[i] = count;  
	        }  
	        
	        //Displays the frequency of each element present in array  
	       
	        for(int i = 0; i < x.length; i++){  
	            if(x[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + x[i]);  
	}
	}
	}
package org.la.student.noura.array;

public class CountOccurrencesofEachElementinArray {

	public static void main(String[] args) {
		//Write a java program to count occurrences of each element in an array
		

        int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};   
       
        int [] fr = new int [arr.length];  
       
        int visited = -1;  
       
        for(int i = 0; i < arr.length; i++){  
            int count =1; 
;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    fr[j] = visited; //To avoid counting same element again  

                                    }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
            }  
   
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(arr[i] + "   " + fr[i]);  
        }  
 
    }
	
}  
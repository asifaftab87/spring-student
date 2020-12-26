package org.la.student.ameen;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		// Write a java program to find duplicate elements in an array? 
		int array [] = { 1 , 2  , 3 , 4, 5 ,1,2 ,4 ,6, 7 ,8 } ;
		System.out.println(" Duplicate Element in Array");
		
		for(int i = 0; i < array.length; i++) 
		{  
            for(int j = i + 1; j < array.length; j++) 
            {  
                if(array[i] == array[j])  
                {
                    System.out.println(array[j]);
                }
                }
		}
	}

}

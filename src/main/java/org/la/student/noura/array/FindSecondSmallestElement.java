package org.la.student.noura.array;

public class FindSecondSmallestElement {

	public static void main(String[] args) {
		//Write a Java program to find the second smallest element in an array
		

	    int[] a = {-1, 4, 0, 2, 7, -3};
	    
	    int tmp;
	    
	    for (int i=0;i<a.length;i++) {
	    	
	    	for(int j=i+1;j<a.length;j++) {
	    		
	    		if (a[i]>a[j])
	    		{
	    			tmp=a[i];
	    			a[i]=a[j];
	    			a[j]=tmp;
	    			
	    		}
	    		
	    	}
	    	
	    	
	    }System.out.println("second smala element= "+a[1]);

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   }   
	}
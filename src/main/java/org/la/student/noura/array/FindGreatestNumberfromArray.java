package org.la.student.noura.array;

public class FindGreatestNumberfromArray {
	public static void main(String[] args) {
		//wap to find greatest number from any array 
		
		
		
		int []n= {4,5,7,9,11};
		
        int max = n[0];
        
        for(int i = 0; i <n.length; i++)
        {
        	System.out.println(n[i]);
           
        	if(n[i]>max)
            	
            {
                max = n[i];
            }
        }
        System.out.println("Maximum value:"+max);
	}

}

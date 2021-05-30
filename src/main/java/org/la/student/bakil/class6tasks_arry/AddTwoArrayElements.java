package org.la.student.bakil.class6tasks_arry;
/*
 * wap to add two array elements n copy into third array
 */
public class AddTwoArrayElements {

	public static void main(String[] args) {
	
		int[] a1   = { 1, 3, 2, 17}; 
        int[] a2   = { 4, 2, 9, 6};
        int[] a3    =  new int [a1.length+a2.length];
        
        for (int i=0;i<a2.length;i++) {
			
			a3[i] =a1[i]+a2[i];
        }
   
        for (int y:a3) {
        	System.out.print(y+"  ");
        }
     
	}
         }
         
	

       

		


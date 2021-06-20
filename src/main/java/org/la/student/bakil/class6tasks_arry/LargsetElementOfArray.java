package org.la.student.bakil.class6tasks_arry;
/*
 * wap to find greatest number from any array 
 */
public class LargsetElementOfArray {

	public static void main(String[] args) {
	
		int a []  = { 23 ,57,66,51 };
        int large = a[0];

        for (int num: a) {
            if(large < num)
                large = num;
        }

        System.out.println("The largest number from an arry = "+large);
	}
	        }
	
		


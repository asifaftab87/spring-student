package org.la.student.bakil.class6tasks_arry;
/*
 * wap to find smallest number among array element
 */
public class Question15 {

	public static void main(String[] args) {
	
		int a []  = { 23 ,57,66,51 };
        int small = a[0];

        for (int num: a) {
            if(small > num)
                small = num;
        }

        System.out.println("The smallest number from an arry = "+small);
	}
	        }
	
		


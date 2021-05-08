package org.la.student.bakil.class5tasks.for_loop;
/*
 * Wap to print all Armstrong numbers between 1 to n.
 */
public class Question68 {

	public static void main(String[] args) {

		int num1=1, num2=1000;

	      for (int i = num1; i<num2; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(""+i+" is an Armstrong number.");
	         }
    }

    }
}
		  

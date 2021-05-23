package org.la.student.barry.loop.task;

public class Loop22 {
	
	//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.

	public static void main(String[] args) {
	 int i= 10;
	 for(; i<=70; i++) { 
		 if(i%3!=0 && i%5!=0) {
		
		 System.out.println("number divisible by 3 and 5: "+i);
     }
   }
 }
}

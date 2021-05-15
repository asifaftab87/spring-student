package org.la.student.barry.loop.task;

public class Loop24 {
	
	//wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.

	public static void main(String[] args) {
	 for(int i= 10; i<=90; i++) { 
		 if(i%5==0 && i%2==0) {
		
		 System.out.println("number divisible by 2 and 5: "+i);
     }
   }
 }
}

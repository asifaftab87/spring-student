package org.la.student.barry.loop.task;

public class Loop26 {
	
	//wap to print all numbers between 200 to 1 those are divisible by 13 and 2.

	public static void main(String[] args) {
	 for(int i= 10; i<=200; i++) { 
		 if(i%2==0 && i%13==0) {
		
		 System.out.println("number divisible by 2 and 13: "+i);
     }
   }
 }
}

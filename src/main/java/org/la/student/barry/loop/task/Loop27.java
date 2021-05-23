package org.la.student.barry.loop.task;

public class Loop27 {
	
	//wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.

	public static void main(String[] args) {
	 for(int i= 10; i<=1500; i++) { 
		 if(i%11==0 && i%13==0) {
		
		 System.out.println("number divisible by 11 and 13: "+i);
     }
   }
 }
}

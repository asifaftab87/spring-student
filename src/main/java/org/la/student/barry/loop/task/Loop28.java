package org.la.student.barry.loop.task;

public class Loop28 {
	
	//wap to print all numbers between 10 to 300 those are divisible by 11 and 12.

	public static void main(String[] args) {
	 for(int i= 10; i<=300; i++) { 
		 if(i%11==0 && i%12==0) {
		
		 System.out.println("number divisible by 11 and 12: "+i);
     }
   }
 }
}

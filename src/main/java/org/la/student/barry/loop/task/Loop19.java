package org.la.student.barry.loop.task;

public class Loop19 {
	//wap to print all numbers between 130 to 90 those are not divisible by 10.

	public static void main(String[] args) {
	 int i= 90;
	 for(; i<=130; i++) { 
		 if(i%10==0) {
		
		 System.out.println("number divisible by 10: "+i);
     }
   }
 }
}

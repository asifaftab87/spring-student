package org.la.student.barry.loop.task;

public class Loop23 {
	
	//wap to print all numbers between 10 to 50 those are divisible by 5 and 9.

	public static void main(String[] args) {
	 int i= 10;
	 for(; i<=50; i++) { 
		 if(i%5==0 && i%9==0) {
		
		 System.out.println("number divisible by 9 and 5: "+i);
     }
   }
 }
}
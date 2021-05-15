package org.la.student.barry.loop.task;

public class Loop25 {
	
	//wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.

	public static void main(String[] args) {
	 for(int i= 10; i<=100; i++) { 
		 if(i%11!=0 && i%3!=0) {
		
		 System.out.println("number divisible by 3 and 11: "+i);
     }
   }
 }
}

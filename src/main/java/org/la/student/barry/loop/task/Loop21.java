package org.la.student.barry.loop.task;

public class Loop21 {
	//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.

	public static void main(String[] args) {
	 int i= 10;
	 for(; i<=50; i++) { 
		 if(i%2==0 && i%5==0) {
		
		 System.out.println("number divisible by 2 and 5: "+i);
     }
   }
 }
}

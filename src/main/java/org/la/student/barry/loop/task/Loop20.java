package org.la.student.barry.loop.task;

public class Loop20 {
	//wap to print all numbers between 30 to 80 those are divisible by 6 and 5.

	public static void main(String[] args) {
	 int i= 30;
	 for(; i<=80; i++) { 
		 if(i%6==0 && i%5==0) {
		
		 System.out.println("number divisible by 6 and 5: "+i);
     }
   }
 }
}

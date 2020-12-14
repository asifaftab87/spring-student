package org.la.student.noura.loop;

public class EvenNum {

	public static void main(String[] args) {
		//Wap to print all even numbers between 1 to 100
		//while loop
		int a=1;
		while (a<=100) {
			if (a%2==0) {System.out.print(a+" ");}
			a++;
			
		}

		System.out.println("             ");
	

	
	//for loop
	
	for(int e=1;e<=100;e++) {
		if(e%2==0)
		System.out.print(e+" ");
	}
      }
   }
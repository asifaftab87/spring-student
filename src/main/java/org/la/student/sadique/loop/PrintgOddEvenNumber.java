package org.la.student.sadique.loop;
//wap to print first five odd numbers.
public class PrintgOddEvenNumber {

	public static void main(String[] args) {
		int a;
		for(a=1;a<=10;a++) { 
			if(a%2==0)
			System.out.println("Even Number : "+a);
		}System.out.println(" ");
		//wap to print first five even numbers.
		for(a=1;a<=10;a++) {
			if(a%2!=0)
				System.out.println("Odd Number : "+a);
		}System.out.println(" ");
		//wap to print all even numbers between 100 to 120.
		for(a=100;a<=120;a++) { 
			if(a%2==0)
			System.out.println("Even Number : "+a);
		}System.out.println(" ");
		//	wap to print all odd numbers between 120 to 100.
		for(a=120;a>=100;a--) { 
			if(a%2==0)
			System.out.println("Odd Number : "+a);
		}
	}
}

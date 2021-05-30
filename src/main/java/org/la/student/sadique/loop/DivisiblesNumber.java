package org.la.student.sadique.loop;
//wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
public class DivisiblesNumber {

	public static void main(String[] args) {
		int num;
		for (num = 30; num <= 80; num++) {
			if (num % 5 == 0 && num % 6 == 0)
				System.out.println("only " + num + " Is Divisible By 5 and 6 ");
		}
		System.out.println(" ");
		// wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
		for (num = 10; num <= 50; num++) {
			if (num % 2 == 0 && num % 5 == 0)
				System.out.println("only " + num + " Is Divisible By 2 and 5 ");
		}
		System.out.println(" ");
		// wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		for (num = 10; num <= 50; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				System.out.println("only " + num + " Is Divisible By 5 and 9 ");
		}
		System.out.println(" ");
		// wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		for (num = 200; num >= 1; num--) {
			if (num % 13 == 0 && num % 2 == 0)
				System.out.println("only " + num + " Is Divisible By 13 and 2 ");
		}
		System.out.println(" ");
		// wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
		for (num = 1; num <= 1500; num++) {
			if (num % 11 == 0 && num % 13 == 0)
				System.out.println("only " + num + " Is Divisible By 11 and 13");
		}
		System.out.println(" ");
		// wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
		for (num = 10; num <= 300; num++) {
			if (num % 11 == 0 && num % 12 == 0)
				System.out.println("only " + num + " Is Divisible By 11 and 12");
		}
		System.out.println(" ");
		// wap to print all numbers between 100 to 1 those are divisible by 11 and 3
		for (num = 100; num >= 1; num--) {
			if (num % 11 == 0 && num % 3 == 0) {
				System.out.println("only " + num + " Is Divisible By 11 and 3");
			}
		}
	}

}

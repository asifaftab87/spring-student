package org.la.student.sadique.loop;
//Wap to find sum of all odd numbers between 1 to n.
public class SumOfAllOddNumber {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Sum Of All Even Number");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}

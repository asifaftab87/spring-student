package org.la.student.rasheed;
/*
 * Write a Java program to check if an array of integers without 0 and -1?
 */
import java.util.Scanner;
public class ArrayTaskQuestion35 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number you want to check:");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number + " is positive number");
            } else if (number < 0) {
                System.out.println(number + " is negative number");
            } else {
                System.out.println(number + " is neither positive nor negative");

	}
		}
	}
}

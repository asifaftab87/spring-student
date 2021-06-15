package org.la.student.barry.method.task;

import java.util.Scanner;

public class QuestionOne {


	  public static void main(String[] args) {
	    // create Scanner class object to take input
	    Scanner scan = new Scanner(System.in);

	    // read size of the array
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();

	    // create an int array of size n
	    int numbers[] = new int[n];

	    // take input for the array
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }

	    // display negative numbers
	    displayNegative(numbers);

	    // close Scanner
	    scan.close();

	  }

	  // method to display negative numbers
	  public static void displayNegative(int[] numbers) {

	    // variables
	    boolean gui = false;
	    int i = 0;

	    // check is there any negative numbers?
	    for (i = 0; i < numbers.length; i++) {
	      if(numbers[i] < 0){
	        gui = true;
	        break;
        }	      
      }
	 // -ve number is not available
	    if(!gui) {
	      System.out.println("Array doesn’t contain negative number.");
	      return;
	    }
	    
	    // display -ve numbers
	    System.out.println("Negative numbers = ");
	    for (; i < numbers.length; i++) {
	      if(numbers[i] < 0) {
	        System.out.print(numbers[i]+" ");
	      }
	    }
   } 
}
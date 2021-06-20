package org.la.student.muhammad.abdullahi.methods;

public class printEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,4,5,7,8,9};
		printEvenNumbers(arr);
	
	}
	static void printEvenNumbers(int x[]) {
		System.out.println("printing all even numbers from an array");
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0)
				System.out.println(x[i]+ " ");
		}
	
		
	} 
	
}


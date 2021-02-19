package org.la.student.tahir.method;

public class Array {

	public static void main(String[] args) {
		
		avr();
		min();
		secondlargest();
		printOddNo();
		printEvenNo();
		primeNo();
	}
 
	static int b = 20;

	
	
	// Average of the elements of an array
	
	public static void avr() {
	
	 int[] a = new int[b];
	
	double sum =0;
	System.out.print("Elements: ");
	for(int i=0;i<a.length;i++) {
		
		a[i]= i+1;
		System.out.print( a[i]+" ");
		
		
	}
	System.out.println("");

	for (int i=0; i<a.length;i++) {
		
		sum = sum + a[i];
		//System.out.println(sum);
	}
	
	double average = sum/a.length;
	System.out.println("The lenght of the array is: " +a.length);
	System.out.println("Sum of the elements is: " +sum);
	System.out.println("The average is: " +average);
}
	
	//Min element
	
	public static void min() {
		 int[] a = new int[b];
		
		 
		 for(int i=0; i<a.length;i++) {
			 a[i]= i+1;
		 }
		 int min =a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) 
				a[i]=min;
			}
		
		System.out.println("The smallest element is: " +min);
	}
	
	//Second largest
	
	public static void secondlargest() {
		
		int[] a = new int[b];
		int largest= a[0];
		int secondlargest =a[0];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]=i+1;
			
		}
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>largest) {
				
				secondlargest= largest;
				 largest= a[i];
				
			}
			
			else if (a[i]> secondlargest) {
				
			 secondlargest=a[i];
			}
		}
		
		System.out.println("The second largest element is: " +secondlargest);
	}
	
	public static void printOddNo() {

		int[] a = new int[b];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]=i+1;
			
		}
		System.out.print("The odd numbers are: " );
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2 != 0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
	
	
	
	public static void printEvenNo() {
		System.out.println();
		int[] a = new int[b];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]=i+1;
			
		}
		System.out.print("The even numbers are: " );
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
		}
		
	
	

	public static void primeNo() {
		System.out.println();
		int[] a = new int[b];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]=i+1;
		
		}
		System.out.print("The prime numbers are: " );
		
		for(int i=0; i<a.length+1; i++) {
			
			boolean isprime=true;
			
			for(int j=2; j<i; j++) {
				
				if(i%j ==0) {
					
					isprime = false;
					break;
				}
			
				
			}
			if(isprime)
				System.out.print(i + " ");
			
	
	

}
}}
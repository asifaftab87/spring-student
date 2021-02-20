package org.la.student.tahir.method;

public class Array {

	public static void main(String[] args) {
		
		avr();
		min();
		secondlargest();
		printOddNo();
		printEvenNo();
		primeNo();
		CopyArrayInReverseOrder();
		copyArraytoOneArray();
		addElementsof2ArrayIntoThirdArray();
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
	
	//OddNo
	
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
	
	//EvenNo
	
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
		
	
	

	//PrimeNo
	
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
}
	
	
	//CopyArrayInReverseOrder
	
	public static void CopyArrayInReverseOrder() {
		System.out.println(" ");
		int[] a = new int[b];
		int[] b = new int[a.length];
		
		for(int i= a.length-1; i>=0; --i) {
			
			a[i]= i;
			b[i]= a[i];
			
		}
		
		System.out.println("Array A values");
		
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("Array B values");
		
		for(int i= b.length-1; i>=0; --i) {
			
			System.out.println(b[i]);
		}
		
		
	}
	
	//copy one array into other array
	public static void copyArraytoOneArray() {
		
		int[] a = new int[b];
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			
			a[i]= i;
			b[i]= a[i];
			
		}
		
		System.out.println("Elements of Array A");
		
		for(int i=0; i< a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("Elements of Array B");
		
		for(int i=0; i<b.length;i++) {
			
			System.out.println(b[i]);
		}
	}
	
	//add two array elements n copy into third array
	
	public static void addElementsof2ArrayIntoThirdArray() {
		System.out.println("Adding two arrays into a third array");
		
		int[] a = {2,3,4};
		int[] b = {1,8,9};
		
		int arr1= a.length;
		int arr2= b.length;
		
		int[] c = new int[arr1 + arr2];
		int i=0;
		
		for(; i<a.length;i++) {
			
			c[i]= a[i];
		}
		
		for(int j=0; j<b.length; j++) {
			
			c[i]= b[j];
		
			i++;
		}
		
		for(int x=0; x< c.length; x++) {
			
			System.out.println(c[x]);
			
		}
		
	}
	
}
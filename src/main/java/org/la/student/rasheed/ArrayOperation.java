package org.la.student.rasheed;

/*
 * When you have 3 line code and you want to print the value in method
 * 
 */
public class ArrayOperation {

	public static void main(String[] args) {
		
		int arr [] = {1,2, 5, 66, 21};
		//when you pass one value below, it will show you an error, suppose i wrote
		//print (arr[0]); purpose of this method is returning an array, when you pass one element on it
		//it becomes integer
		print(arr);
		int sum =addArrayElements(arr); // here you pass the array of sum element
		System.out.println("sum: "+sum);
		
		
		//Here you write (int rev[] = copyreverse (arr); and also pass the element which is arr
		
		int rev[] = copyReverse(arr);
		System.out.println("reverse");
			print(rev);

		
		//Write 1 line of code and pass the value
		// what ever you pass in the method it will print the value
		int b [] = {12, 42, 15, 66, 21};
		print(b);
		sum =addArrayElements(b); // here you pass the array of sum element
		System.out.println("sum: "+sum);
		
		int c [] = {90, 33, 77};
		print(c);
		
		rev = copyReverse(c);
		System.out.println("reverse");
			print(rev);
		
		int d [] = {99, 34, 23};
		print (d);
		
		//Ctrl and space is auto suggestion in java
	}
	//Here is the method, 
	
	/*
	 * How to copy one array into another in reverse?
	 */
	static int addArrayElements(int a[]) {
		int s =0;
		for(int i : a) {
			s+=i;
			// how add all element of an array and print the sum is above program,
			
		}
		return s;
	}
	static int [] copyReverse(int s[]) {
		//first thing you have to do is write the program int t []=new [s.length];
		int t [] = new int [s.length];
		//second process( you can use any number of comma in the below code of (forLoop), but semi-colon only two inside the program)
		for (int b=0, l=t.length-1; b<t.length; b++, l--) {
			t[l] = s[b];
			
		}
		return t; // you declared a arr of int and you are returning the arr 
	}
	static void print(int arr[]) {
			for (int a : arr) {
				//you remove the (LN) from the SOP; so that the value will be from left to right
				System.out.print(a+" ");
		}
			System.out.println();
	
	

}


}

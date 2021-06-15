package org.la.student.asif.method;

public class ArrayOperation {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 5, 21};
		print(arr);
		int sum = addArrayElements(arr);
		System.out.println("sum: "+sum);
		int rev[] = copyReverse(arr);
		
		System.out.println("reverse");
		print(rev);
		
		int b[] = {12, 42, 15, 66, 21};
		sum = addArrayElements(b);
		System.out.println("sum: "+sum);
		print(b);
		rev = copyReverse(b);
		print(rev);
		
		int c[] = {90, 33, 77};
		print(c);
	}
	
	static int addArrayElements(int a[]) {
		int s = 0;
		for(int i : a) {
			s += i;
		}
		return s;
	}
	
	static int[] copyReverse(int s[]) {
	
		int t[] = new int[s.length];
		for(int b=0, l=t.length-1; b<t.length ; b++, l--) {
			t[l] = s[b];
		}
		return t;
	}
	
	static void print(int arr[]) {
		for(int a : arr) {
			System.out.print(a+"  ");
		}
		System.out.println();
	}
}
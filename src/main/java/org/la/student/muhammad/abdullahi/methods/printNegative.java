package org.la.student.muhammad.abdullahi.methods;

public class printNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-3,-2,-1,0,4,3};
		printNegative(arr);
	}
	 
	static void printNegative(int[]a) {
		System.out.println("printing negative numbers from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)
				System.out.println(a[i]+ " ");
		}
		
	}

}


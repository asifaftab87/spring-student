package org.la.student.muhammad.abdullahi.methods;

public class printPositive {

	public static void main(String[] args) {
		int arr[]= {1,-2,3,-5,6,7};
		printPositive(arr);

	}

	static void printPositive(int[]a) {
		
		System.out.println("printing positive from an array");
		for(int i=0;i<a.length;i++){
			if(a[i]>0)
				System.out.println(a[i]+ " ");
		}
		
	}
}

package org.la.student.muhammad.abdullahi.methods;

public class printNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-3,-2,-1,0,4,3};
		int n= 5;
		printNum(arr,n);
	}
	 
	static void printNum(int[]a, int n) {
		
		
		boolean x= false;
		System.out.println("finding number from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)
				x=true;
		}
		if(x) {
			System.out.println(n+" found");
		}
		else {
			System.out.println(n+" not found");
		}
		
	}
}


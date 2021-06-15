package org.la.student.nizaam.methods;

public class Q10Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,7,4,5,6};
		int greatest = greatest(arr);
		System.out.println(greatest);
		
	}
	
	static int greatest(int[] a) {
		int res=0;
		System.out.println("Greatest of elements");
		for(int i=0;i<a.length-1;i++) {
			if(res<a[i]) {
				res=a[i];
			}
			
		}
		return res;
	}

}

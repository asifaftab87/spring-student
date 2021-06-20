package org.la.student.muhammad.abdullahi.array;

class array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,6,7,8};
		int b[]= new int [a.length];
		
		int l=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[l-i];
		
		
	
			System.out.println(b[i]);
		
		}
	}

}

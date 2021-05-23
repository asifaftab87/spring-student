package org.la.student.nizaam.array;

public class Q21PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,7,9,13,14,16};
		int m;
		boolean bool;
		
		for(int i=0;i<a.length;i++) {
			
			m=a[i]/2;
			bool=true;
			for(int j=2;j<=m;j++) {
				if(a[i]%j==0) {
					bool=false;
					break;
				}
			}
			
			if(bool)
				System.out.println(a[i]);
		}
	}

}

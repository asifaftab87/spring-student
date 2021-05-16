package org.la.student.nizaam.array;

public class Q20ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?
		
		int a[]= {1,3,4,2,5}, b[]= {1,3,5,2,5};
		boolean bool = true;
		for(int i=0; i<a.length;i++) {
			if(a[i]==b[i]) {
				continue;
			}
			else {
				bool = false;
				break;
			}
				
		}
		if(bool)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}

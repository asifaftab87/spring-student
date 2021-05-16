package org.la.student.nizaam.array;

public class Q19DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,6,9,4,8,2,7,9};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}

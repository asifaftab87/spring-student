package org.la.student.noor;
//Write a java program to find duplicate elements in an array?
public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5,6,6,7,8,9,9};

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

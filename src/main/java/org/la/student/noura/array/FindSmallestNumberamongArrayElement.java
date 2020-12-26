package org.la.student.noura.array;

public class FindSmallestNumberamongArrayElement {

	public static void main(String[] args) {
		//wap to find smallest number among array element
		
		int a[]= {6,8,3,9,5};

		int min=a[0];
		for (int k=0;k<a.length;k++)

		{
			System.out.println(a[k]);
			
			if(a[k]<min) {
				min=a[k];
			}	
		}
		System.out.println("minimum value ="+min);

	}

}

package org.la.student.jamal.array;

public class array15 {
	
	//	15) wap to find smallest number among array element

	public static void main(String[] args) {
		
	
		int temp,size;
		int array[]= {12,3,45,6,67,34};
		
		size=array.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if ( array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
 
		System.out.println(array[0]);
	}

}

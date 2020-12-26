package org.la.student.tahir.array;

public class Largestelementinanarray {

	public static void main(String[] args) {
		// wap to find greatest number from any array
		
		int[] a = {2,10,8,7,100};
		int greatest= a[0];
		 
		for(int i=0; i<a.length;i++) {
			
			if(a[i]>greatest) 
				greatest=a[i];
			
		}
		
		System.out.println("The greatest is : " +greatest);
	}

}

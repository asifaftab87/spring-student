package org.la.student.jamal.array;

public class array8 {
	
	//08) wap to print number divisible by given number from an array

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			if (a[i]%a[0]==0) {
				System.out.println("this number is divisible by a[1]: " + a[i]);
			}
			
		}
		

	}

}

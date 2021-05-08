package org.la.student.noor;
//wap to print all numbers between 30 to 50 those are not divisible by 7.
public class ForLoop13 {

	public static void main(String[] args) {
		int n=50;
		int i;
		for(i=30;i<n;i++) {
			if(i%7!=0) {
				System.out.println(i);
			}
		}

	}

}

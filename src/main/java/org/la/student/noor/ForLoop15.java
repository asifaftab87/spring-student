package org.la.student.noor;
//wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
public class ForLoop15 {

	public static void main(String[] args) {
		int n=80;
		int i;
		for(i=30;i<n;i++) {
			if(i%6==0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}

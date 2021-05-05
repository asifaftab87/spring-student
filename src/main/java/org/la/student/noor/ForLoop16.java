package org.la.student.noor;
//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
public class ForLoop16 {

	public static void main(String[] args) {
		int n=70;
		int i;
		for(i=10;i<n;i++) {
			if(i%3!=0 && i%5!=0) {
				System.out.println(i);
			}
		}


	}

}

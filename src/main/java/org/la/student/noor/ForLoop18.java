package org.la.student.noor;
//wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.

public class ForLoop18 {
	public static void main(String[] args) {
		int n=1500;
		int i;
		for(i=1;i<n;i++) {
			if(i%11==0 && i%13==0) {
				System.out.println(i);
			}
		}

}
}

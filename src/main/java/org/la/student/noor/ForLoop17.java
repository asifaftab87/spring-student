package org.la.student.noor;
//wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
public class ForLoop17 {

	public static void main(String[] args) {
		int i=1;
		int num;
		for(num=100;num>i;num--) {
			if(num%11!=0 && num%3!=0) {
				System.out.println(num);
			}
		}

	}

}

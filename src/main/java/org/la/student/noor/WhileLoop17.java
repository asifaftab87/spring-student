package org.la.student.noor;
//wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
public class WhileLoop17 {

	public static void main(String[] args) {
		int i=1;
		int num=100;
		while(num>i) {
			if(num%11!=0 && num%3!=0) {
				System.out.println(num);
			}
			num--;
		}

	}

}

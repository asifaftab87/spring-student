package org.la.student.noor;
//wap to print all numbers between 130 to 90 those are not divisible by 10
public class WhileLoop14 {

	public static void main(String[] args) {
		int i=90;
		int num=130;
		while(num>i) {
			if(num%10!=0) {
				System.out.println(num);
			}
			num--;
		}
	}

}

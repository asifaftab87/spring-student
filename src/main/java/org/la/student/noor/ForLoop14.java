package org.la.student.noor;
//wap to print all numbers between 130 to 90 those are not divisible by 10
public class ForLoop14 {

	public static void main(String[] args) {
		int i=90;
		int num;
		for(num=130;num>i;num--) {
			if(num%10!=0) {
				System.out.println(num);
			}
		}

	}

}

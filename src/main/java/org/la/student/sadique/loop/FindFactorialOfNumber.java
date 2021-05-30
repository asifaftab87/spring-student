package org.la.student.sadique.loop;
//wap to find factorial of a given number
public class FindFactorialOfNumber {
	public static void main(String[] args) {
		int no=4;
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}System.out.println(fact);
	}

}

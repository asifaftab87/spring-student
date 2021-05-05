package org.la.student.noor;
//wap to print numbers which is completely divisible by 3 between 1 to 10.
public class ForLoop4 {

	public static void main(String[] args) {
		int n=10;
		int num;
		for(num=1;num<n;num++)
		{
			if(num%3==0) {
				System.out.println(num);
			}
		}

	}

}

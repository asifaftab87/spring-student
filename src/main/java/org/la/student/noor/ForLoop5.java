package org.la.student.noor;
//wap to print numbers which is completely divisible by 10 between 1 to 100.
public class ForLoop5 {

	public static void main(String[] args) {
		int n=100;
		int i;
		for(i=1;i<n;i++)
		{
			if(i%10==0) {
				System.out.println(i);
			}
		}

	}

}

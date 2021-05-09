package org.la.student.nizaam.loop;

public class Q18NotDivisibleby10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	18.	wap to print all numbers between 130 to 90 those are not divisible by 10.
		for(int i=130;i>=90;i--)
		{
			if(i%10!=0) {
				System.out.println(i);
			}
		}
	}

}

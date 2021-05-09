package org.la.student.nizaam.loop.whilee;

public class Q62Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	62.	Wap to check whether a number is palindrome or not.
		
	int num = 1234321,r,rev=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			rev= rev*10+r;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}

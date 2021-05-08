package org.la.student.noor;
//wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
public class WhileLoop6 {

	public static void main(String[] args) {
		int n=10;
		int num=1;
		while(num<n)
		{
			if(num%3==0 && num%2==0) {
		    System.out.println(num);
			}
			num++;
			
	}

	}

}

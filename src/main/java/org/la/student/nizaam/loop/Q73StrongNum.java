package org.la.student.nizaam.loop;

public class Q73StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	73.	Wap to check whether a number is Strong number or not.
		
		int n = 144,fact,num,sum=0,temp;
		temp=n;
		while(n>0) {
			num=n%10;
			fact=1;
			for(int i=0; i<num;i++) {
				fact=fact*(num-i);
			}
			n=n/10;
			sum=sum+fact;
		}
		if(temp==sum)
			System.out.println("Strong Number");
		else
			System.out.println("not strong number");
	}

}

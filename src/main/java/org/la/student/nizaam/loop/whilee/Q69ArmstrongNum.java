package org.la.student.nizaam.loop.whilee;

public class Q69ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	69.	Wap to check whether a number is Armstrong number or not.
		
		int num= 153,res=0,r,temp;
		temp=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			res = res+ r*r*r;
		}
		if(temp==res)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
		
	}

}

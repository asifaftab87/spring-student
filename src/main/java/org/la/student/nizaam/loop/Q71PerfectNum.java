package org.la.student.nizaam.loop;

public class Q71PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	71.	Wap to check whether a number is Perfect number or not.
		
		int num=4,sum=0;
		
		for(int i=1;i<num;i++) {
			if(sum>num)
				break;
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}

}

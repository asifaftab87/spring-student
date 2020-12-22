package org.la.student.sajid;

public class CkeckArmstrongNumber {
	public static void main(String[] args) {
//		Wap to check whether a number is Armstrong number or not.
		int num=153,r=0,s=0;
		int orgNum=num;
		while(orgNum!=0) {
			r=orgNum%10;
			s+=(r*r*r);
			orgNum/=10;
		}
		if(s==num) {
			System.out.println("this is Armstrong number: "+s);
		}else
			System.out.println("this number is not Armstrong number: "+s);
	}

}

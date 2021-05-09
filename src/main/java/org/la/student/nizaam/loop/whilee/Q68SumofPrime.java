package org.la.student.nizaam.loop.whilee;

import org.hibernate.internal.build.AllowSysOut;

public class Q68SumofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	68.	Wap to find sum of all prime numbers between 1 to n.
		
		int mid,num,sum=0;
		for(int i=2;i<=20;i++) {
			num=i;
			int count =0;
			if(num%2==0) {
				mid=num/2;
			}else {
				mid=(num/2)+1;
			}
			
			
			for(int j=1;j<=mid;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count<2) {
				System.out.print(num+",");
				sum=sum+num;
			}
				
		}

		System.out.println("sum of prime numbers is : "+ sum);
	}

}

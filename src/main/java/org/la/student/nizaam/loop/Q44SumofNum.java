package org.la.student.nizaam.loop;

public class Q44SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	44.	wap to find sum of a number e.g ip=1234,  op=10
		
		int num=12345,sum=0;
		for(int i=1; num>0;i++) {
			sum = sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}

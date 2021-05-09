package org.la.student.nizaam.loop.whilee;

public class Q53SumofOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	53.	Wap to find sum of all odd numbers between 1 to n.
		int i=1,sum=0;
		
		while(i<20) {
			if(i%2!=0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}

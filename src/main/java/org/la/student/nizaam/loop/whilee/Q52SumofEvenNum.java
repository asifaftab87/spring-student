package org.la.student.nizaam.loop.whilee;

public class Q52SumofEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	52.	Wap to find sum of all even numbers between 1 to n.
		
		int i=1,sum=0;
		
		while(i<20) {
			if(i%2==0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}

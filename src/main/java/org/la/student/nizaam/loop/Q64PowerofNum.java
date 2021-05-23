package org.la.student.nizaam.loop;

public class Q64PowerofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	64.	Wap to find power of a number using for loop.
		
		int num = 2, power=3,res=1;
		for(int i=1;i<=power;i++) {
			res=res*num;
		}
		System.out.println(res);
	}

}

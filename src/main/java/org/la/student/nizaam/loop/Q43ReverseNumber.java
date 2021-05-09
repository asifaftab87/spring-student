package org.la.student.nizaam.loop;

public class Q43ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero
		
		int num=12345,res=0;
		
		for(int i=1; num>0;i++) {
			int r=num%10;
			num=num/10;
			res=r+res*10;
		}
		
		System.out.println(res);
		
	}

}

package org.la.student.nizaam.loop;

public class Q41Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	41.	wap to print fibonocci series
		
		int F0=0,F1=1,temp;
		System.out.print("0,1,");
		for(int i=1;i<21;i++) {
			temp=F0+F1;
			System.out.print(temp+",");
			F0=F1;
			F1=temp;
		}
	}

}

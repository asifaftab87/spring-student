package org.la.student.nizaam.methods;

public class Q23fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		fibonocci(8);
	}
	
	static void fibonocci(int a) {
		int f1=1,f2=1,temp;
		
		System.out.print("0, "+f1 +", "+f2+", ");
		for(int i=2;i<a;i++) {
			System.out.print(f1+f2+", ");
			temp=f1;
			f1=f2;
			f2=temp+f2;
		}
	}

}

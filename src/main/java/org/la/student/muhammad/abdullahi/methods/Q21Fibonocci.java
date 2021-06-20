package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q21Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		Fibonocci(num);
	}
	static void Fibonocci(int a) {
		
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
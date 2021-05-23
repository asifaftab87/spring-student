package org.la.student.sadique.clas;

public class GreatestNumberAmongThree {

	public static void main(String[] args) {
		//  wap to find greatest number among three numbers.
		int obj1=32;
		int obj2=43;
		int obj3=14;
		int res=((obj1>obj2)?((obj1>obj3)?obj1:obj3):((obj2>obj3)?obj2:obj3));
		System.out.println(res+" Is greatest number");

	}

}

package org.la.student.sadique.clas;

public class LeastNumberAmongThree {

	public static void main(String[] args) {
		// wap to find least number among three numbers.
		int obj1=12;
		int obj2=13;
		int obj3=11;
		int res=((obj1<obj2)?((obj1<obj3)?obj1:obj3):((obj2<obj3)?obj2:obj3));
		System.out.println(res+" Is least number");

	}

}

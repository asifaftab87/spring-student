package org.la.student.sajid;

public class TernaryOperator1 {
	public static void main(String[] args) {
		//Nested
		int x=21,y=40,z=2;
		int r=(x>y)?(x>z?x:z):(y>x?y:z);
		System.out.println(r);
	}

}

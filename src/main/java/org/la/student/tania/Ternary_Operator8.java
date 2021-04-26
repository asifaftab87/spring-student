package org.la.student.tania;

public class Ternary_Operator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 13, y = 6, z = 68;
		
		int r = (x>y)?(x>z?x:z):(y>z?y:z);
		
		System.out.println("r: "+r);
	}

}

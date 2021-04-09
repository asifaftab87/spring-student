package org.la.student.tahir.coll;

public class WrapClass {

	public static void main(String[] args) {
	
		Integer i = 2;		//Boxing
		Integer o = new Integer(3);
		int k = i;  //Unboxing 
		int j = o;
		
		System.out.println("i: "+i);
		System.out.println("o: "+o);
		System.out.println("k: "+k);
		System.out.println("j: "+j);
		

	}

}

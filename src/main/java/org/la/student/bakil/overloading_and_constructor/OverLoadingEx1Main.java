package org.la.student.bakil.overloading_and_constructor;

public class OverLoadingEx1Main {

	public static void main(String[] args) {

		OverLoadingEx1 over = new OverLoadingEx1();
		
		over.sub(false, 3);
		over.sub(2, 4);
		over.sub(3, 5, 1);
	}

}

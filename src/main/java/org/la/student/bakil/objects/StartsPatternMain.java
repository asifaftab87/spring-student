package org.la.student.bakil.objects;

public class StartsPatternMain {

	public static void main(String[] args) {

		
		StarsPattern p = new StarsPattern ();
		
		p.increaseStar(6);
		System.out.println(" ");
		p.decreaseStart(6);
		p.increaseStartFromRight(8);
		System.out.println(" ");
		p.decreaseStartFromRight(8);
		p.Dimond(6);
		System.out.println("");
		p.Pyramid(6);
		System.out.println(" ");
		p.reversePyramid(6);
	}

}

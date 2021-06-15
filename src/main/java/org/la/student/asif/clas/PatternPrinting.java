package org.la.student.asif.clas;

public class PatternPrinting {

	public static void main(String[] args) {
		
		Pattern pattern = new Pattern();
		System.out.println("Diamond");
		pattern.diamond(5);
		System.out.println("increase star");
		pattern.increaseStar(3);
		System.out.println("decrease star");
		pattern.decreaseStar(6);
	}
}

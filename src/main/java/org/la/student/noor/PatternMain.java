package org.la.student.noor;

public class PatternMain {
	public static void main(String[] args) {
	
	Pattern pattern = new Pattern();
	System.out.println("Diamond");
	pattern.diamond(4);
	System.out.println("increase star");
	pattern.increaseStar(5);
	System.out.println("decrease star");
	pattern.decreaseStar(6);
	System.out.println("reverse pyramid");
	pattern.reversePyramid(5);
	System.out.println("increase number");
	pattern.increaseNumber(4);
}
}


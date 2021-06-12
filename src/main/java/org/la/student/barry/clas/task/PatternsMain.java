package org.la.student.barry.clas.task;

public class PatternsMain {
	
	  public static void main(String[] args) {
		  
		Patterns patterns= new Patterns();
		
		System.out.println("IncreaseStar:");
		patterns.increaseStar(5);
		System.out.println("DecreaseStar:");
		patterns.decreaseStar(5);
		System.out.println("IncreaseStarFromRight:");
		patterns.increaseStarFromRight(6);
		System.out.println("DecreaseStarFromRight:");
		patterns.decreaseStarFromRight(6);
		System.out.println("Diamont:");
		patterns.diamond(7);
		System.out.println("Pyramid:");
		patterns.pyramid(8);
		System.out.println("ReversePyramid:");
		patterns.reversePyramid(8);
		
	}

}

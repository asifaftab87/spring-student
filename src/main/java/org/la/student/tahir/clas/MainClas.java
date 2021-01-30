package org.la.student.tahir.clas;

public class MainClas {

	public static void main(String[] args) {
		
		Printingpattern p = new Printingpattern();
		System.out.println("1: Increased Star");
		p.IncreasedStar(5);
		System.out.println("2: Decreased Star");
		p.decreasedStar(5);
		System.out.println("3: Increased Star Right");
		p.increasedstarR(5);
		System.out.println("4: Decreased Star Right");
		p.decreasedstarR(5);
		
		System.out.println(" New Class : Maths");
		Maths m = new Maths();
		m.largest(400, 90, 6);
		m.smallest(400,90, 6);
		
		System.out.println("integer : "+m.getinteger());
		
		System.out.println("Sum = " +m.addition(10, 20, 30));
	
	}

}

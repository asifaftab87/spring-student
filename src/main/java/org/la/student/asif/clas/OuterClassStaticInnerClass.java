package org.la.student.asif.clas;

public class OuterClassStaticInnerClass {

	public void outerMethod() {
		Earth earth = new Earth();
	}
	
	public static class Earth{
		public void atmosphere() {
			System.out.println("Atmosphere good for living");
		}
	}
}
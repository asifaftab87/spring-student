package org.la.student.aameen.method;

public class ReturnMethod {

	public static void main(String[] args) {
		// Not accepting but returning 
		System.out.println(" Main Method");
		
		float u = div();
		System.out.println(" main return value : " +u);
		
	}
	static float div() {
		float y = 44.5f;
		System.out.println(" this is the div method ");
		return y;
	}

}

package org.la.student.rasheed.clas;

public class BodyMain {

	public static void main(String[] args) {
		
		// in this program there no need to create the object, because 
		//it automatic define in such a way that it is always into the memory
		//
		
		Body.roll = 3;
		Body.staticmethod();
		
		Body body = new Body();
		body.instance();
		body.id =99;
		
		body.staticmethod(); // yellow line means warning
		body.roll =66;

	}


}

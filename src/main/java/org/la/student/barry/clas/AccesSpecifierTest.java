package org.la.student.barry.clas;

public class AccesSpecifierTest {

	public static void main(String[] args) {
	 
		AccesSpecifier accesspecifier = new AccesSpecifier();
		accesspecifier.set(1, "fghjk");
		accesspecifier.display();
        // accesspecifier.print(); not allowed as this method is private
		
		//accesspecifier.name= "jack";
		// accesspecifier.id= 3;   not allowed as this method is private
	}

}

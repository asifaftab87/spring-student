package org.la.student.rasheed.clas;

public class AccesSpecifierTest {

	public static void main(String[] args) {
		
		AccesSpecifier accesSpecifier = new AccesSpecifier();
		accesSpecifier.set(1, "wayne");
		accesSpecifier.display();
		
		
		//accesSpecifier.print(); not allowed as this method is private

		
		//accesSpecifier.id =3;    not allowed as this variable is private
	}

}

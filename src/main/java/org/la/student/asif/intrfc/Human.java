package org.la.student.asif.intrfc;

public interface Human {

	default void defaultMethod() {
		System.out.println("default concrete method inside an interface");
	}
	
	void msg();
}


//ctrl + shift + o 
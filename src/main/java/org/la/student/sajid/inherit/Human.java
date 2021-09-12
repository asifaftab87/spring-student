package org.la.student.sajid.inherit;

public interface Human {
	default void defaultMathod() {
		System.out.println("default Concrete method insaide an interface");
	}
	void msg();

}

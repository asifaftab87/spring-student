package org.la.student.aqsa;

public class InnerOuterClass {
	
	void display() {
		System.out.println("Outer");
		
	}
	
	class Interf{
		
		public void display()
		{
			System.out.println("Inner");

		}
	}
	Interf obj = new Interf();
	
}

class MainImp{
	public static void main(String[] args) {

		InnerOuterClass ob = new InnerOuterClass();
		ob.display();
		ob.obj.display();
	}
}

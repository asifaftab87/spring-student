package org.la.student.aqsa;

public interface InnOut {

	void display();
	
	interface InntOut{
	
		void show();
	}
	
}

class MainImplmnt implements InnOut.InntOut, InnOut{
	
	public static void main(String[] args) {
		
		InnOut.InntOut obj = new  MainImplmnt();
		obj.show();
		InnOut ob= new  MainImplmnt();
		ob.display();
	}

	@Override
	public void show() {
		System.out.println("Inner Interface");
		
	}
	
	public void display() {
		System.out.println("Outer Interface");
		
	}
}


package org.la.student.aqsa;

public interface Interface4 {

	void meth1();
}
interface Interf{
	void meth2();
	
}
interface Interfac{
	
	void meth3();
}

class MainImplements implements Interface4,Interf,Interfac {
	public void meth1() {
		System.out.println("Meth1");
	}
	public void meth2() {
		System.out.println("Meth2");
		
	}
	public void meth3() {
		System.out.println("Meth3");
		
	}
	
	public static void main(String[] args) {
	Interface4 ob = new MainImplements();
	ob.meth1();
	
	Interf obj = new MainImplements();
	obj.meth2();
	
	Interfac objj = new MainImplements();
	objj.meth3();
	
	
	}
}

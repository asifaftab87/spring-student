package org.la.student.barry.abstrct;

public abstract class MixMethodAbstractClass {
	public MixMethodAbstractClass() {
		System.out.println("MixMethodAbstractClass constructor");
	}
	
	public abstract void absMethod2() ;
	public  void absMethod3() {
		System.out.println("absMethod3");
	}
	public abstract void absMethod4();
	public  void absMethod5() {
		String s= "moon";
		
		System.out.println("absMethod4. sum: "+s.toUpperCase());
	}

}

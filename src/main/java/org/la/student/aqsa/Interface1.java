package org.la.student.aqsa;

public interface Interface1 {
	
     //variables are public static final by default	

	 /**public static final**/ int i = 10; 
    
    //methods are public abstract by default
	    
	/**public abstract**/  void name();
	    
	    
	   public void name6() ;   //public accepted
	// private void name();    error public, abstract, default, static and strictfp are permitted
    // protected void name();  error only public is permitted
	   
	   
	   
	 /** Three modifier accepted only**/
	 
	   abstract void name2();  
	   static void name3()   // it can have static method with body
	   {
		   System.out.println("this is static method ");
	   }  
	   default void name4()  // it can have default method with body
	   {
		   System.out.println("this is default method ");
	   }   
	
}

class ChildImplement implements Interface1{

	@Override
	public void name() {
		System.out.println("this is name() ");
		
	}

	@Override
	public void name6() {
		System.out.println("this is name6() ");
		
	}

	@Override
	public void name2() {
		System.out.println("this is name2() ");
		
	}
	
}

class MainImplement {
	public static void main(String[] args) {
		
	Interface1 obj = new ChildImplement();
	obj.name();
	obj.name6();
	obj.name2();
	Interface1.name3();
	obj.name4();
	

	}
}
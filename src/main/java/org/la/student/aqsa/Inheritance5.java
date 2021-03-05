package org.la.student.aqsa;

	class Inheritance5
	{
	    static void methodOfX()
	    {
	        System.out.println("Class X");
	    }
	    
		
	  /* void methodOfX()    Duplicate method of line 5  methodOfX() not possible
	    {
	        System.out.println("Class X");
	    }
	    */
	}
	class Expect extends Inheritance5
	
	{
	   /*
	@Override                   not overriding however it is method hiding
	   static void methodOfX()  The method methodOfX()of type Expect must override or implement a supertype method
	    {
	        System.out.println("Class Y");
	    }
	    */
	 
	  static void methodOfX()   //This static method cannot hide the instance method from Inheritance5
	    {
	        System.out.println("Class Y");
	    }
	 
		/*void methodOfX() {   //This instance method cannot override the static method from Inheritance5
			
		}
		*/
	    public static void main(String[] args) {
	    	Inheritance5.methodOfX();
	    }
	    
	    
	    
	    // static parent
	    // static child  possible but its not overriding its method hiding, compile time
	    
	    // static parent 
	    // non static child not possible
	    
	    //non static parent
	    // static child not possible
}
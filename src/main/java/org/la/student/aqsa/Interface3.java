package org.la.student.aqsa;

public class Interface3{  
	
	    interface MyInterfaceB{ 
	    	
	        void myMethod();  
	    }
	}  
	    
	class NestedInterfaceDemo2 implements Interface3.MyInterfaceB{  
	
		public void myMethod(){
	    
			System.out.println("Nested interface method");
	     }  
	    
	     public static void main(String args[]){  
	        
	    	 Interface3.MyInterfaceB obj = new NestedInterfaceDemo2();  
	        obj.myMethod();  
	     
	     }  
	}


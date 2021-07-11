package org.la.student.jamal.inherit.impl;


import org.la.student.jamal.inherit.ProtectedExample;


public class SamePackProExampleChild extends ProtectedExample {
	
  public static void main (String[]arr) {
	  
	  SamePackProExampleChild child= new SamePackProExampleChild();
	  child.example();
	  
		
	}
  
  public void example() {
	  System.out.println("id: "+ id);
	  print();
  }

}

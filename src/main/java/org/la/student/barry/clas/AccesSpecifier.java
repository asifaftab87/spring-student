package org.la.student.barry.clas;

public class AccesSpecifier {
	private int id;
	private String name;
	
	public void display() {
		//System.out.println("display() -- id: "+id+"   name: "+name );
		print();
	}
	    public void set(int i, String n) {
	    	id=i;
	    	name=n;
	    }
        private void print() {
        	System.out.println("print()  -- id: "+id+"  name: "+name);
        }
}

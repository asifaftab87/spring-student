package org.la.student.noor;

public class Admin {
	  private int id;
	    private String pwd;
	    private String name;

	    public int getId() {
	    	return id;

	    }

	    public void setId(int i) {
	    	id=i;
	    }

	    public String getPwd() {
	    	return pwd;
	    }
	    public void setPwd(String p) {
	    	pwd=p;
	    }
	    public String getName() {
	    	return name;
	    }
	    public void setName(String n) {
	    	name=n;
	    }
	    public void display() {
	    	System.out.println("id: "+id+"   pwd:  "+pwd+ "   name:  "+name);
	    }
}

package org.la.student.rasheed.clas;

public class Developer {
	
	String name;
	int id;
	String skill;
	
	public void display() {
		System.out.println("id: "+id+"  name: "+name+" skill: "+skill);
		}
	
	public void set(int i, String n, String k) {
		id =i;
		name = n;
		skill =k;
	}

}

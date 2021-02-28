package org.la.student.noura.clas;

public class School {

	
	private String name;
	private Student student;
	
	public void setName (String name) {
		this.name=name;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	
	public String getName() {
		return name;
	}
	public Student getStudent() {
		return student;
	}
}

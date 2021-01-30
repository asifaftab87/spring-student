package org.la.student.asif.clas;

//null pointers check
public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student();
		Student student2 = null;
		System.out.println("student: "+student);
		System.out.println("student2: "+student2);
		
		int id = student.getId();
		System.out.println("student.id: "+id);
		
		if(student2!=null) {
			int id2 = student2.getId();
			System.out.println("student2.id: "+id2);
		}
	}

}

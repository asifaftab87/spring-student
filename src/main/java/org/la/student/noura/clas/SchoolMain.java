package org.la.student.noura.clas;

public class SchoolMain {

	public static void main(String[] args) {

		Student student=new Student(1, "mohanned", "ahf@gmail.com"," 09348934");//first : to set value
		
		
		School school =new School();
		school.setName("mohammed");
		school.setStudent(student);// second: passing the object 

		String email=school.getStudent().getEmail();
		System.out.println("email: "+email);
		System.out.println("nama: "+school.getName());
		
		
		
	}

}

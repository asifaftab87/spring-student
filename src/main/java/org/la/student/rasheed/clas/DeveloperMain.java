package org.la.student.rasheed.clas;

public class DeveloperMain {

	public static void main(String[] args) {
		
		
		Developer developer = new Developer();
		//You can only call the number variable with number operator, without it you can't
		developer.set(1,  "abdul", "java");
		developer.display();
		developer.name ="ibrahim";
		developer.display();

	}

}

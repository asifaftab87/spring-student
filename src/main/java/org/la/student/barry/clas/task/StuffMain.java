package org.la.student.barry.clas.task;

public class StuffMain {

	public static void main(String[] args) {
		Stuff stuff= new Stuff();
		stuff.setId(2);
		stuff.setStuffName("business stuff");
		stuff.setThumbNails("over average");
		
		int id= stuff.getId();
		String name= stuff.getStuffName();
		String thumbNails= stuff.getThumbNails();
		
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("ThumbNails: "+thumbNails);
		
		
				
	}

}

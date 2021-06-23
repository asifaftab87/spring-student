package org.la.student.bakil.objects;

public class FinishMain {


	public static void main(String[] args) {

		
		Finish finish = new Finish ();
		
		finish.setId(128633);
		finish.setFinishName("Over");
	
		int id = finish.getId();
		String finishName= finish.getFinishName();
		
		System.out.println("Id :"+id );
		System.out.println("Finish name :"+finishName);
	
	}

}

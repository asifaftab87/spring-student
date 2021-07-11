package org.la.student.abdullahi.methods.setters.getters;

public class FinishMain {


	public static void main(String[]args) {
		
		Finish f = new Finish();
		f.setId("F201");
		f.setFinishName("zalora");
		
		String Id = f.getId();
		String FinishName= f.getFinishName();
		
		System.out.println("Id = " +Id);
		System.out.println("Finish Name = "+ FinishName);
	}

     
}
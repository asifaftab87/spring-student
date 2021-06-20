package org.la.student.kayes.methods;

public class PresentationMain {

	public static void main(String[] args) {
		Presentation pre=new Presentation();
		pre.setpresId(20);
		pre.setId(5780);
		pre.setbookId(21);
		pre.setstart("10:30");
		pre.setend("5:30");
		
		int n1=pre.getpresId();
		int n2=pre.getId();
		int n3=pre.getbookId();
		String start=pre.getstart();
		String end=pre.getend();
		
		System.out.println("presentation id  =  "+n1);
		System.out.println("bookedcompany id  =  "+n2);
		System.out.println("bookedroom id  =  "+n3);
		System.out.println("Start time  =  "+start);
		System.out.println("End time  =  "+end);
		

	}

}

package org.la.student.barry.clas.task;

public class FinishMain {
   public static void main(String[] args) {
	
	   Finish finish= new Finish();
	   finish.setId(88);
	   finish.setFinishName("Done the job");
	   
	   int id= finish.getId();
	   String finishName= finish.getFinishName();
	   
	   System.out.println("Id: "+id);
	   System.out.println("FinishName: "+finishName);
	   
}
}

package org.la.student.sajid.cls;

public class StudentContractorMain {
	public static void main(String[] args) {
//		contractor
		StudentContractor studentContractor=new StudentContractor();
//		StudentContractor studentContractor1=new StudentContractor();
//		StudentContractor studentContractor2=new StudentContractor();
		studentContractor.dispaly();
		
//		Parameterized contractor 
		StudentContractor studentContractor3=new StudentContractor(2,"Prince","princeraj054@gmail.com","7610061177");
		studentContractor3.dispaly();
	
	}
	
}

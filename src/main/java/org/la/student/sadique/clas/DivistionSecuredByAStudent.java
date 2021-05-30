package org.la.student.sadique.clas;

public class DivistionSecuredByAStudent {

	public static void main(String[] args) {
		//wap to find division secured by a student
		int scor=98;
		if(scor>90 && scor<=100) {
			System.out.println( " A Grad");
		}else if(scor>80 && scor<90) {
			System.out.println(" B Grad");
		}else if(scor>70 && scor<80) {
			System.out.println(" C Grad");
		}else if(scor>60 && scor<70) {
			System.out.println(" D Grad");
		}else if(scor>45 && scor<60) {
			System.out.println(" E Grad");
		}else if (scor<45 ) {
			System.out.println(" FAIL Grad");
		}

	}

}

package org.la.student.sajid;

public class ControlStatement13 {
	public static void main(String[] args) {
		
		int a=84;
		char cr=(char)a;
		
		if(cr>65 && cr<90 ){
			System.out.println("Uppercase= "+cr);
		}else if(cr>97 && cr<122) {
			System.out.println("Lowercase= "+cr);
		}else {
			System.out.println("Invilide");
		}
	}

}

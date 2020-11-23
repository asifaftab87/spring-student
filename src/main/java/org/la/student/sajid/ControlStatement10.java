package org.la.student.sajid;

public class ControlStatement10 {
	public static void main(String[] args) {
		int a=2;
		
		if(a>=80 && a<=100) {
			System.out.println("A");
			
		}else if(a>=60 && a<80){
			System.out.println("B");
			
		}else if(a>=50 && a<60) {
			System.out.println("C");
			
		}else if(a>=45 && a<50) {
			System.out.println("D");
			
		}else if(a>=25 && a<45) {
			System.out.println("E");
			
		}else if(a<=25) {
			System.out.println("Fail");
			
		}
	}

}


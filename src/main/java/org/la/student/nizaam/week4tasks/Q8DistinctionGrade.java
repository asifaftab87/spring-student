package org.la.student.nizaam.week4tasks;

public class Q8DistinctionGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	8.	wap to find distinction secured by a student
		
		int Percentage = 45;
		
		if(Percentage>=80) {
			System.out.println("Student secured distinction");
		}else if (Percentage>=70) {
			System.out.println("Student secured First Class");
		}else if(Percentage>=60) {
			System.out.println("Student secured Second Class");
		}else if(Percentage>=50) {
			System.out.println("student secured Pass Grade");
		}else {
			System.out.println("Student failed");
		}
	}
	

}

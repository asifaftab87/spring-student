package org.la.student.nizaam.week4tasks;

public class Q10SchoolGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade.
		 */
		
		int studentPercentage[] = {20,35,48,55,65,85};
		
		for(int i=0; i<studentPercentage.length;i++) {
			if(studentPercentage[i]>80) {
				System.out.println("student"+i+" secured A Grade");
			}else if(studentPercentage[i]>60) {
				System.out.println("student"+i+" secured B Grade");
			}else if(studentPercentage[i]>50) {
				System.out.println("student"+i+"secured C Grade");
			}else if(studentPercentage[i]>45) {
				System.out.println("student"+i+" secured D Grade");
			}else if(studentPercentage[i]>25) {
				System.out.println("student"+i+" secured E Grade");
			}else
				System.out.println("student"+i+" secured F Grade");
		}
			
		
	}

}

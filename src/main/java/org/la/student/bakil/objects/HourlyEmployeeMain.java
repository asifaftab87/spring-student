package org.la.student.bakil.objects;

public class HourlyEmployeeMain {

	public static void main(String[] args) {

		
		HourlyEmployee hour = new HourlyEmployee();
		
		hour.steIdNum(2231);
		hour.setSalaryAn("$2000");
		hour.setEmlpoyeeId(1987313);
		
		int idN = hour.getIdNum();
		String SalaryAn=hour.getAnnualSalaries();
		int employeeId=hour.getEmployeeId();
		
		System.out.println("Id number :"+idN+'\n'+"Annual salary :"+SalaryAn+'\n'+"Employee id :"+employeeId);
		
	}

}

package org.la.student.barry.clas.task;

public class ColorsMain {

	public static void main(String[] args) {
		
		Colors colors= new Colors();
		colors.setVariablesId(2);
		colors.setColorName("Red");
		
		int variablesId= colors.getVariablesId();
		String colorName= colors.getColorsName();
		
		System.out.println("VariablesId: "+variablesId);
        System.out.println("ColorName: "+colorName);
	}

}

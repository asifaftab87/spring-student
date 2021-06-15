package org.la.student.barry.clas.task;

public class DimensionsMain {

	public static void main(String[] args) {
		
		Dimensions dimensions= new Dimensions();
		dimensions.setDimensionValue(15);
		dimensions.setVariablesId(40);
		
		int variablesId= dimensions.getVariablesId();
		int dimensionValue= dimensions.getDimensionValue();
		
		System.out.println("VariablesId: "+variablesId);
		System.out.println("DimensionValue: "+ dimensionValue+" meter");

	}

}

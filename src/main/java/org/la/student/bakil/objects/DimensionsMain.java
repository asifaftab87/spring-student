package org.la.student.bakil.objects;

public class DimensionsMain {

	public static void main(String[] args) {

		
		Dimensions d = new Dimensions();
		
		d.setId(8966773);
		d.setDimensionValue("Provider _ Process");
		
		int id = d.getId();
		String dimensionsValue =d.getDimensionValue();
		
		System.out.println("Id :"+id);
		System.out.println("Dimensions value :"+dimensionsValue);
	}

}

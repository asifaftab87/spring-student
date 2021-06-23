package org.la.student.kayes.methods;

public class DimensionMain {

	public static void main(String[] args) {
		DimensionsHasProductVarient dim=new DimensionsHasProductVarient();
		dim.setDimension(55);
		dim.setProduct(85);
		dim.setVarient(100);
		
		int di=dim.getDimension();
		int pro=dim.getProduct();
		int var=dim.getVarient();
		
		System.out.println("DIMENSION ID  =  "+di);
		System.out.println("PRODUCT ID  = "+pro);
		System.out.println("VARIENT ID  =  "+var);
	}

}

package org.la.student.barry.clas.task;

public class DimensionHasProductVariantMain {
	public static void main(String[] args) {
		
	
	DimensionHasProductVariant dimensionHasProductVariant = new DimensionHasProductVariant();
	dimensionHasProductVariant.setDimensionId(33);
	dimensionHasProductVariant.setProductId(45);
	dimensionHasProductVariant.setVariantId(5);
	
	int dimensionId= dimensionHasProductVariant.getDimensionId();
	int productId= dimensionHasProductVariant.getProductId();
	int variantId= dimensionHasProductVariant.getVariantId();
	
	System.out.println("DimensionId: "+dimensionId);
	System.out.println("ProductId: "+ productId);
	System.out.println("VariantId: "+variantId);
	
	
	
	
	}
}

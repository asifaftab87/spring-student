package org.la.student.bakil.objects;

public class DimensionHasProductVariantMain {

	public static void main(String[] args) {

		
		DimensionHasProductVariant di = new DimensionHasProductVariant ();
			
		di.setDimensionId(88766362);
		di.setProductId(4362677);
		di.setVariantId(112322);

		int dimensionId = di.getDimensionId();
		int productId = di.getProductId();
		int variantId = di.getVariantId();
	
		System.out.println("Dimension Id :"+dimensionId);
		System.out.println("Product Id :"+productId);
		System.out.println("Variant Id :"+variantId);
	
	}

}

package org.la.student.bakil.objects;
/*
 * Create a class DimensionHasProductVariant having member variables dimensionId, productId, variantId. create getters and setters for all member variables. 
   Create object of DimensionHasProductVariant class in other class inside main method and set all member values and print all member values using getters.
 */
public class DimensionHasProductVariant {

	
	private int dimensionId;
	private int productId;
	private int variantId;
	
	// Dimension Id
	public void setDimensionId(int d) {
		dimensionId=d;
	}
	public int getDimensionId() {
		return dimensionId;
	}
	
	// Product Id
	public void setProductId(int p) {
		productId=p;
	}
	public int getProductId() {
		return productId;
	}
	
	// Variant Id
	public void setVariantId(int v) {
		variantId=v;
	}
	public int getVariantId() {
		return variantId;
	}
	
	public void display() {
		System.out.println("Dimension Id :"+dimensionId+"Product id :"+productId+"Variant Id :"+variantId);
	}
}

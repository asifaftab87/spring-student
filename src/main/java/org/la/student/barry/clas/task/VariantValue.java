package org.la.student.barry.clas.task;

public class VariantValue {
	/*
	 * Create a class VariantValue having member variables productId, optionId, valueId, dimensionId, variantId, price, sku.
	 *  create getters and setters for all member variables. 
	 *  Create object of VariantValue class in other class inside main method and set all member values and print all member values using getters.
	 */

	private int productId, optionId, valueId; 
	private int dimensionId;
	private int variantId;
	private int price;
	private int sku;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int i) {
		productId=i;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int j) {
		optionId=j;
	}
	public int getValueId() {
		return valueId;
	}
	public void setValueId(int k) {
		valueId=k;
	}
	
	public int getDimensionId() {
		return dimensionId;
	}
	public void setDimensionId(int l) {
		dimensionId=l;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setvariantId(int m) {
		variantId=m;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int n) {
		price=n;
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int o) {
		sku=o;
	}
	
}

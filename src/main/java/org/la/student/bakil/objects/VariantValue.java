package org.la.student.bakil.objects;
/*
 * Create a class VariantValue having member variables productId, optionId, valueId, dimensionId, variantId, price, sku. 
 * create getters and setters for all member variables.
   Create object of VariantValue class in other class inside main method and set all member values and print all member values using getters.
 */
public class VariantValue {

	
	private int productId;
	private int optionId;
	private int valueId;
	private int dimensionId;
	private String price;
	private String sku;
	
	//Product id 
	public void setProductId(int p) {
		productId=p;
	}
	public int getProductId() {
		return productId;
	}
	
	//Option id 
	public void setOptionId(int o) {
		optionId=o;
	}
	public int getOptionId() {
		return optionId;
	}
	
	// Value id
	public void setValueId(int v) {
		valueId=v;
	}
	public int getValueId() {
		return valueId;
	}
	
	// Dimension Id
	public void setDimensionId(int d) {
		dimensionId=d;
	}
	public int getDimensionId() {
		return dimensionId;
	}
	
	// Price 
	public void setPrice(String c) {
		price =c;
	}
	public String getPrice() {
		return price;
	}
	
	// SKU
	public void setSku(String k) {
		sku=k;
	}
	public String getSku() {
		return sku;
	}
	
	public void display() {
		System.out.println("Product id :"+productId+"Option id :"+optionId+"Value id :"+valueId
				+"Dimension id :"+dimensionId+"Price :"+price +"Sku :"+sku);
	}

}

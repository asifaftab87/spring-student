package org.la.student.bakil.objects;
/*
 * Create a class ProductOptionRelation having member variables productId, optionId. create getters and setters for all member variables. 
   Create object of ProductOptionRelation class in other class inside main method and 
   set all member values and print all member values using getters.
 */
public class ProductOptionRelation {


	private int productId;
	private int optionId;
	
	
   // Product id 
	public void setProductId(int i) {
		productId=i;
	}
	public int getProductId() {
		return productId;
	}
	
	// Option id 
	public void setOptionId(int o) {
		optionId =o;
	}
	public int getOptionId() {
		return optionId;
	}
	
	public void display() {
		System.out.println("Product id :"+productId+"Option id :"+optionId);
	}

}

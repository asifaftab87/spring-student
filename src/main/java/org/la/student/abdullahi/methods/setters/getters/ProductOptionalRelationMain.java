package org.la.student.abdullahi.methods.setters.getters;

public class ProductOptionalRelationMain {


	public static void main(String[]args) {
		
		ProductOptionalRelation p = new ProductOptionalRelation();
		p.setProductId("PT1015");
		p.setOptionId("OP1100");
		
		String ProductId =p.getProductId();
		String OptionId= p.getOptionId();
		
		System.out.println("Product Id = "+ ProductId);
		System.out.println("Option Id = "+OptionId);
	}

     
}
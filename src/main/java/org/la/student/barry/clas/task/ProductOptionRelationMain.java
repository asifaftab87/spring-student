package org.la.student.barry.clas.task;

public class ProductOptionRelationMain {

	public static void main(String[] args) {
		ProductOptionRelation productOptionRelation= new ProductOptionRelation();
		productOptionRelation.setProductId(00022);
		productOptionRelation.setOptiontId(2100);
		
		int productId= productOptionRelation.getOptionId();
		int optionId= productOptionRelation.getProductId();
		
		System.out.println("ProductId: "+productId);
		System.out.println("OptionId: "+optionId);
		

	}

}

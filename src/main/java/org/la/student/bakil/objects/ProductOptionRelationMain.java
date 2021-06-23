package org.la.student.bakil.objects;

public class ProductOptionRelationMain {


	public static void main(String[] args) {

		ProductOptionRelation option= new ProductOptionRelation();
		
		option.setProductId(3232423);
		option.setOptionId(786521);

		
		int productId= option.getOptionId();
		int optionId = option.getOptionId();
		
		System.out.println("Product id :"+productId);
		System.out.println("Option id :"+optionId);
	}

}

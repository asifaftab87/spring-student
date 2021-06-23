package org.la.student.bakil.objects;

public class ProductMain {

	public static void main(String[] args) {

		
		Product product = new Product();
		
		product.setId(755442);
		product.setProductName("Samsung");
		product.setBaseRelationTable("Type _ Model ");
		product.setPatternId(76524);

		
		int id =product.getId();
		String productName =product.getProductName();
		String baseRelationTable=product.getBaseRelationTable();
		int patternId = product.getPatternId();
		
		System.out.println("Id :"+id);
		System.out.println("Product name :"+productName);
		System.out.println("Base relation table :"+baseRelationTable);
		System.out.println("Pattern id :"+patternId);
	}

}

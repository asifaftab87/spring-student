package org.la.student.barry.clas.task;

public class ProductMain {

	public static void main(String[] args) {
		Product product= new Product();
		product.setId(3);
		product.setProductName("Kumputal");
		product.setBaseRelationTable(10);
		product.setDescription("black");
		product.setPatternId(15);
		
		int id= product.getId();
		String productName=product.getProductName();
		int baseRelationTable= product.getBaseRelationTable();
		String description= product.getDescription();
		int pattern = product.getPatternId();
		
		System.out.println("Id: "+id);
		System.out.println("ProductName: "+productName);
		System.out.println("BaseRelationTable: "+baseRelationTable);
		System.out.println("Description: "+ description);
		System.out.println("Pattern: "+pattern);
		
		

	}

}

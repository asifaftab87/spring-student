package org.la.student.abdullahi.methods.setters.getters;

public class BaseRelationTableMain {

	public static void main(String[]args) {
		
		BaseRelationTable b =new BaseRelationTable();
		b.setId(01);
		b.setBrandsId("Toyota");
		b.setCategoryId("1011");
		b.setCollectionId("2312");
		
		int Id= b.getId();
		String BrandsId = b.getBrandsId();
		String CategoryId = b.getCategoryId();
		String CollectionId = b.getCollectionId();
		
		System.out.println("Id = " +Id);
		System.out.println("Brands Id = " +BrandsId);
		System.out.println("Category Id = " +CategoryId);
		System.out.println("Collection Id = "+ CollectionId);
		
		
	}
}
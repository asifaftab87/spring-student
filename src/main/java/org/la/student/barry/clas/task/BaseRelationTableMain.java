package org.la.student.barry.clas.task;

public class BaseRelationTableMain {

	public static void main(String[] args) {
		BaseRelationTable baseRelationTable= new BaseRelationTable();
		baseRelationTable.setId(7);
		baseRelationTable.setBrandsId(22233);
		baseRelationTable.setCategoryId(1111);
		baseRelationTable.setCollectionId(5444);
		
		int id= baseRelationTable.getId();
		int brandsId=baseRelationTable.getBrandsId();
		int categoryId=baseRelationTable.getCategoryId();
		int collection= baseRelationTable.getCollectionId();
		
		System.out.println("Id: "+id);
		System.out.println("BrandsId: "+brandsId);
		System.out.println("Category: "+categoryId);
		System.out.println("Collection: "+collection);
		

	}

}

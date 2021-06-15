package org.la.student.barry.clas.task;

public class BaseRelationTable {
	/*
	 * Create a class BaseRelationTable having member variables id, brandsId, categoryId, collectionId.
	 *  create getters and setters for all member variables. Create object of BaseRelationTable class
	 *   in other class inside main method and set all member values 
	 *   and print all member values using getters.
	 */

	private int id;
	private int brandsId;
	private int categoryId;
	private int collectionId;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public int getBrandsId() {
		return brandsId;
	}
	public void setBrandsId(int j) {
		brandsId=j;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int k) {
		categoryId=k;
	}
	public int getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(int l) {
		collectionId=l;
	}
}

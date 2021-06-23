package org.la.student.bakil.objects;
/*
 * Create a class BaseRelationTable having member variables id, brandsId, categoryId, collectionId. 
 * create getters and setters for all member variables. 
   Create object of BaseRelationTable class in other class inside main method and set all member values and print all member values using getters.
 */
public class BaseRelationTable {

	
	private int id;
	private int brandsId;
	private int categoryId;
	private int collectionId;
	
	
	// Id
	public void setId(int i) {
		id=i;
	}
	public int getId() {
	return id;
	}
	
	// Brands Id
	public void setBrandsId(int b) {
		brandsId=b;
	}
	public int getBrandsId() {
		return brandsId;
	}
	
	// Category Id
	public void setCategoryId(int c) {
		categoryId=c;
	}
	public int getCategoryId() {
		return categoryId;
	}
	
	// Collection Id
	public void setCollectionId(int h) {
		collectionId=h;
	}
	public int getCollectionId() {
		return collectionId;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Brands id :"+brandsId+"Category id :"+categoryId+"Collection id :"+collectionId);
	}
}

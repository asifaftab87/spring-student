package org.la.student.bakil.objects;
/*
 * Create a class Product having member variables id, productName, description, baseRelationTable, patternId. 
 * create getters and setters for all member variables. 
   Create object of Product class in other class inside main method and set all member values and print all member values using getters
 */
public class Product {

	private int id;
	private String productName;
	private String description;
	private String baseRelationTable;
	private int patternId;
	
	// Id
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	// Product name 
	public void setProductName(String p) {
		productName=p;
	}
	public String getProductName() {
		return productName;
	}
	
	// Base Relation Table
	public void setBaseRelationTable(String s) {
		baseRelationTable=s;
	}
	public String getBaseRelationTable() {
		return baseRelationTable;
	}
	
	// Pattern id
	public void setPatternId(int d) {
		patternId=d;
	}
	public int getPatternId() {
		return patternId;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Product name :"+productName+"Description :"+description+"Base relation table :"+baseRelationTable
				+"Pattern id :"+patternId);
		
	}
}

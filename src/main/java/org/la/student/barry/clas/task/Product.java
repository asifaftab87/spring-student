package org.la.student.barry.clas.task;

public class Product {
	/*
	 * 	Create a class Product having member variables id, productName, description, baseRelationTable,
	 *  patternId. create getters and setters for all member variables. Create object of Product class
	 *   in other class inside main method and set all member values and print all 
	 *   member values using getters.
	
	 */
	
	private int id;
	private String productName;
	private String description;
	private int baseRelationTable;
	private int patternId;
	
	public int getId() {
		return id;
	}
	 public void setId(int i) {
		 id=i;
	 }
	 public String getProductName() {
			return productName;
		}
		 public void setProductName(String n) {
			 productName=n;
		 }
		 public String getDescription() {
				return description;
			}
			 public void setDescription(String d) {
				 description=d;
			 }
			 public int getBaseRelationTable() {
					return baseRelationTable;
				}
				 public void setBaseRelationTable(int b) {
					 baseRelationTable=b;
				 }
				 public int getPatternId() {
						return patternId;
					}
					 public void setPatternId(int p ) {
						 patternId=p;
					} 

}

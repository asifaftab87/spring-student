package org.la.student.barry.clas.task;

public class ProductVariant {
	/*
	 * 	Create a class ProductVariant having member variables variantId, productId, finishId,
	 *  colorsId, metadata, thumbnails. create getters and setters for all member variables. 
	 *  Create object of ProductVariant class in other class inside main method and set all 
	 *  member values and print all member values using getters.
	 *  
	 */
	
	private int variantId, colorsId;
	private int productId, finishId;
	private int megadata;
	private String thumbNails;
	
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int i) {
		variantId=i;
	}
	public int getColorsId() {
		return colorsId;
	}
	public void setColorsId(int j) {
		colorsId=j;
	}
	public int getProductId() {
		return productId;
	}
	public void setProdcutId(int k) {
		productId=k;
	}
	public int getFinishId() {
		return finishId;
	}
	public void setFinishId(int l) {
		finishId=l;
	}
	public int getMegadata() {
		return megadata;
	}
	public void setMegadata(int m) {
		megadata=m;
	}
	public String getThumbNails() {
		return thumbNails;
	}
	public void setThumbNails(String t) {
		thumbNails=t;
	}

}

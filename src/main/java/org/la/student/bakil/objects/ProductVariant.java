package org.la.student.bakil.objects;
/*
 * Create a class ProductVariant having member variables variantId, productId, finishId, colorsId, metadata, 
   thumbnails. create getters and setters for all member variables.
   Create object of ProductVariant class in other class inside main method and
   set all member values and print all member values using getters.
 */
public class ProductVariant {


	private int variantId;
	private int productId;
	private int finishId;
	private int colorsId;
	private String metadata;
	private String thumbnails;
	
	// Variant id 
	public void setVariantId(int v) {
		variantId=v;
	}
	public int getVariantId() {
		return variantId;
	}
	
	// Product id
	public void setProductId(int p) {
		productId=p;
	}
	public int getProductId() {
		return productId;
	}
	
	// Finish id 
	public void setFnishId(int f) {
		finishId=f;
	}
	public int getFinishId() {
		return finishId;
	}
	
	// Colors id 
	public void setColorsId(int c) {
		colorsId =c;
	}
	public int getColorsId() {
		return colorsId;
	}
	
	// Meta data
	public void setMetaData(String m) {
		metadata=m;
	}
	public String getMetaData() {
		return metadata;
	}
	
	// Thumbnails
	public void setThumbnails(String t) {
		thumbnails=t;
	}
	public String getThumbnils() {
		return thumbnails;
	}
	
	public void display () {
	 System.out.println("Variant id :"+variantId+"Product id :"+productId+"Finish id :"+finishId+"Colors id :"+colorsId
			 +"Meta data :"+metadata+"Thumb nails :"+thumbnails);
	}
	
	
	

}

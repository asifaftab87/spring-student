package org.la.student.abdullahi.methods.setters.getters;

public class ProductVariant {

	private String VariantId;
	private String ProductId;
	private String FinishId;
	private String ColorsId;
	private String MetadataId;
	private String Thumbnail;


   public void setVariantId(String v) {
	   VariantId = v;
   }
   public String getVariantId() {
	   return VariantId;
   }
   public void setProductId(String p) {
	   ProductId = p;
   }
   public String getProductId() {
	   return ProductId;
   }
   public void setFinishId(String f) {
	   FinishId = f;
   }
   public String getFinishId() {
	   return FinishId;
   }
   public void setColorsId(String c) {
	   ColorsId =c ;
   }
   public String getColorsId() {
	   return ColorsId;
   }
   public void setMetadataId(String m) {
	  MetadataId = m;
   }
   public String getMetadataId() {
	   return MetadataId;
   }
   public void setThumbnail(String t) {
	   Thumbnail = t;
   }
   public String getThumbnail() {
	   return Thumbnail;
   }
}
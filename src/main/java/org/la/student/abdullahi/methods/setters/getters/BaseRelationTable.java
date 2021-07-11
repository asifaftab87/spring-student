package org.la.student.abdullahi.methods.setters.getters;

public class BaseRelationTable {

	private int Id;
	private String BrandsId;
	private String CategoryId;
	private String CollectionId;



       public void setId(int i) {
    	   Id=i;
       }
       public int getId() {
    	   return Id;
       }    
       
       public void setBrandsId(String b) {
    	   BrandsId=b;
       }
       public String getBrandsId() {
    	   return BrandsId;
       }
       public void setCategoryId(String c) {
    	   CategoryId=c;
       }
       public String getCategoryId() {
    	   return CategoryId;
       }

       public void setCollectionId(String x) {
	   CollectionId=x;
       }
       public String getCollectionId() {
    	   return CollectionId;
}
      
}
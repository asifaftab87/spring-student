package org.la.student.abdullahi.methods.setters.getters;

public class Orders {

	private int Id;
	private String UserId;
	private String Status;
	private String CreatedAt;


       public int getId()
       {
	return Id;
} 
       public String getUserId() {
    	   
    	   return UserId;
       }
      
       
       public void setId(int i) {
    	   Id=i;
       }
       
       public void setUserId(String u) {
    	   UserId=u;
       }
       
       public void setStatus(String s) {
    	   
    	   Status= s;
       }
       public String getStatus() {
    	   
    	   return Status;
       }
  public String getCreatedAt() {
    	   
    	   return CreatedAt;
       }
  public void setCreatedAt(String c) {
	   CreatedAt=c;
  }
    
}
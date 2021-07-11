package org.la.student.abdullahi.methods.setters.getters;

public class OptionValue {

	private int Id;
	private String OptionId;
	private String ValueName;
	



       public void setId(int i) {
    	   Id=i;
       }
       public int getId() {
    	   return Id;
       }    
       
       public void setOptionId(String p) {
    	   OptionId=p;
       }
       public String getOptionId() {
    	   return OptionId;
       }
       public void setValueName(String v) {
    	   ValueName=v;
       }
       public String getValueName() {
    	   return ValueName;
       }
     
}
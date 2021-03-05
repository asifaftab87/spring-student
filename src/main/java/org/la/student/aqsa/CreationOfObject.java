package org.la.student.aqsa;

public class CreationOfObject implements Cloneable {

	  protected Object clone() throws CloneNotSupportedException 
	    { 
	        return super.clone(); 
	    } 
	    String name = "";
	    public static void main(String[] args) 
	    { 
	    	CreationOfObject  obj1 = new CreationOfObject(); 
	         try
	         { 
	        	 CreationOfObject obj2 = (CreationOfObject) obj1.clone(); 
	             System.out.println(obj2.name+"Object using clone"); 
	        } 
	         catch (CloneNotSupportedException e) 
	        { 
	          System.out.print("CloneNotSupportedException");
	        }      
	         
	    /*	  try
	        { 
	            Class cls = Class.forName("CreationOfObject"); 
	            @SuppressWarnings("deprecation")
				CreationOfObject obj =(CreationOfObject) cls.newInstance(); 
	            System.out.println(obj.name); 
	        } 
	        catch (ClassNotFoundException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	        catch (InstantiationException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	        catch (IllegalAccessException e) 
	        { 
	            e.printStackTrace(); 
	        }  
	    */
	    } 
}



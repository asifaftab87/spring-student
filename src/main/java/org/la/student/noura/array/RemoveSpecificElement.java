package org.la.student.noura.array;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,5,6,7,8};
		
	    int	toDelete=3;
	
	    int count =0;
	                            for(int i=0;i<a.length;i++) 
	                            {
                                     if (toDelete==a[i]) 
                                     {
                                    	 for(int j=i;j<a.length-1;j++)
                                    	 {
                                    		 a[j]=a[j+1];
                                    	 }
                                    	 count =count+1;
                                    		break; 
                                    		 
                                     }
	                           		
	                            }
	                            
	                            if (count==0) {System.out.println("Element not found");}
	                            else {System.out.println("Element deleted successfully ");
	                            for(int i=0;i<a.length-1;i++)
	                                      {
	                                         	System.out.print(" "+a[i]);
	                                      }
	                            
	                                }
	                            
	                            
	                            
	                            
	}
	
}	
	                            
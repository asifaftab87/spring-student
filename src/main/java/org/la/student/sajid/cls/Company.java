package org.la.student.sajid.cls;

public class Company {
	private String companyName;
	private int companyMakeProduct;
	private double rateOfProducts;

	public void display(){
		System.out.println("Company name: "+companyName);
		System.out.println("Company Make Product: "+companyMakeProduct);
		System.out.println("Rate Of Products: "+rateOfProducts);
		
	}
	
	public void setValue(String cn,int cmp,double rp) {
		companyName=cn;
		companyMakeProduct=cmp;
		rateOfProducts=rp;
	}
	public double getValue() {
		return rateOfProducts;
		
	}
	
}

package org.la.student.sajid.cls;

public class CountryMain {

	public static void main(String[] args) {
		Country.name="indai";// not need create object
		Country.statcMethod();
		Country cty1=new Country();  
		Country cty2=new Country();
		Country cty3=new Country();
		
		cty1.code="c1";
		cty2.code="c2";
		cty3.code="c3";
		System.out.println(cty1.code);
		System.out.println(cty2.code);
		System.out.println(cty3.code); //Bcz this is not static
		
		cty1.name="sajid";
		cty2.name="prince";
		cty3.name="md sajid ali";
		System.out.println(cty1.name);
		System.out.println(cty2.name);
		System.out.println(cty3.name);// this is static, save memory 

	}

}

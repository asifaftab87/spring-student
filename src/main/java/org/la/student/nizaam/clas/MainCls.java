package org.la.student.nizaam.clas;

import java.util.Date;

public class MainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Merchants m = new Merchants();
		m.setId(4567);
		m.setAdminId(29084);
		m.setMerchantName("HP");
		m.setCountrycode("IN");
		m.setCreatedAt(new Date());
		
		System.out.println("ID : "+m.getId());
		System.out.println("Admin ID : "+m.getAdminId());
		System.out.println("Merchant name : "+m.getMerchantName());
		System.out.println("Country Code: "+ m.getCountrycode());
		System.out.println("Created at : "+ m.getCreatedAt());
		
		System.out.println("-------------------");
		
		Products p = new Products();
		p.setId(9234);
		p.setMerchantId(876554);
		p.setName("Laptop");
		p.setPrice(35000);
		p.setCreatedAt(new Date());
		p.setStatus("New");
		
		System.out.println("Id : "+ p.getId());
		System.out.println("Merchant Id : "+ p.getMerchantId());
		System.out.println("Name : "+p.getName());
		System.out.println("Price : "+p.getPrice());
		System.out.println("status : "+p.getStatus());
		System.out.println("createdAt : "+p.getCreatedAt());
		
		
		System.out.println("-------------------");
		
		Countries c = new Countries();
		c.setName("India");
		c.setCode("IN");
		c.setContinentName("Asia");
		
		System.out.println("Name : "+c.getName());
		System.out.println("code: "+c.getCode());
		System.out.println("continentName : "+c.getContinentName());
			
		System.out.println("-------------------");
		
		Brands b = new Brands();
		b.setId(98734);
		b.setBrandName("Nike");
		b.setThumbnails("Nike ");
		
		System.out.println("id : "+b.getId());
		System.out.println("brand Name : "+b.getBrandName());
		System.out.println("thumbnails : "+b.getThumbnails());
		
		System.out.println("-------------------");

	}

}

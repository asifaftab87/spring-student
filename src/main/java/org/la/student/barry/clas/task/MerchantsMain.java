package org.la.student.barry.clas.task;

public class MerchantsMain {

	public static void main(String[] args) {
	
	 Merchants merchants= new Merchants();
	 merchants.setId(12);
	 merchants.setMerchantName("Diallo");
	 merchants.setAdminId(444);
	 merchants.setCountryCode(0060);

	 int id= merchants.getId();
	 int adminId=merchants.getAdminId();
	 int countryCode=merchants.getCountryCode();
	 String merchantName= merchants.getMerchantName();
	 
	 System.out.println("Id: "+id);
	 System.out.println("MerchantsName: "+merchantName);
	 System.out.println("AdminId: "+adminId);
	 System.out.println("CountryCode: "+countryCode);
	 
	

	}

}

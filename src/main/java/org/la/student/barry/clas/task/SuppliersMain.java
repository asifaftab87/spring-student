package org.la.student.barry.clas.task;

public class SuppliersMain {

	public static void main(String[] args) {
	  Suppliers suppliers= new Suppliers();
	  suppliers.setSupplierId(101);
	  suppliers.setCompanyName("Fouta firm");
	  suppliers.setContact_fName("Bhoye");
	  suppliers.setContact_lName("Barry");
	  suppliers.setContact_title("Win_Win corperation");
	  suppliers.setAddress1("Soltice");
	  suppliers.setAddress2("Pv2");
	  suppliers.setCity("Cyberjaya");
	  suppliers.setState("Selangor");
	  suppliers.setPostalcode("67000");
	  suppliers.setCountry("Malaysia");
	  suppliers.setPhone("+60185361754");
	  suppliers.setFax("99887968262");
	  suppliers.setEmail("fouta234@gmail.com");
	  suppliers.setUrl("http://www.fouta.djallon.com");
	  suppliers.setPaymentMethods("Cash and Card");
	  suppliers.setDiscountType("friday 50% discount and holliday 40% discount ");
	  suppliers.setTypeGoods_("Foods stuff and electric materials");
	  suppliers.setNotes("Good product");
	  suppliers.setDiscountAvailabe("Only Hollidays");
	  //suppliers.setDiscountType(" limited");
	  suppliers.setCurrentOrder("About 500 ");
	  suppliers.setLogo("Coder");
	  suppliers.setCustomerId(01001);
	  
	  
	  int supplierId= suppliers.getSupplierId();
	  String companyName= suppliers.getCompanyName();
	  String contact_fName= suppliers.getContact_fName();
	  String contact_lName= suppliers.getContact_lName();
	  String contact_title= suppliers.getContact_title();
	  String contact_address1= suppliers.getAddress1();
	  String contact_address2= suppliers.getAddress2();
	  String city= suppliers.getCity();
	  String state= suppliers.getState();
	  String postalcode= suppliers.getPostalcode();
	  String country= suppliers.getCountry();
	  String phone= suppliers.getPhone();
	  String fax= suppliers.getFax();
	  String email= suppliers.getEmail();
	  String url= suppliers.getUrl();
	  String paymentMethods= suppliers.getPaymentMethods();
	  String discountType= suppliers.getDiscountType();
	  String typeGoods_= suppliers.getTypeGoods_();
	  String notes= suppliers.getNotes();
	  String discountAvailabe= suppliers.getDiscountAvailabe();
	  String currentOrder= suppliers.getCurrentOrder();
	  String logo= suppliers.getLogo();
	  int customerId= suppliers.getCustomerId();
	  
	  System.out.println("SupplierId: "+supplierId);
	  System.out.println("CompanyName: "+companyName);
	  System.out.println("Contact_fName: "+contact_fName);
	  System.out.println("Contact_lName: "+contact_lName);
	  System.out.println("Contact_title: "+contact_title);
	  System.out.println("Contact_Address1: "+contact_address1);
	  System.out.println("Contact_Address2: "+contact_address2);
	  System.out.println("City: "+city);
	  System.out.println("State: "+state);
	  System.out.println("PostalCode: "+postalcode);
	  System.out.println("Country: "+country);
	  System.out.println("Phone: "+phone);
	  System.out.println("Fax: "+fax); 
	  System.out.println("Email: "+email);
	  System.out.println("Url: "+url);
	  System.out.println("PaymentMethods: "+paymentMethods);
	  System.out.println("DiscountType: "+discountType); 
	  System.out.println("typeGoods_: "+typeGoods_);
	  System.out.println("Notes: "+notes);
	  System.out.println("DiscountAvailabe: "+discountAvailabe);
	  System.out.println("CurrentOrder: "+currentOrder);
	  System.out.println("Logo: "+logo);
	  System.out.println("CustomerId: "+customerId);
	  
	  
	  
  }
}
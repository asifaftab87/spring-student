package org.la.student.bakil.objects;

public class SuppliersMain {

	public static void main(String[] args) {

		
		Suppliers sup = new Suppliers ();
		sup.setSupplierId(897262);
		sup.setCompanyName("Technology");
		sup.setContact_fName("Kamal");
		sup.setContact_lName("Ali");
		sup.setContact_title("Mr");
		sup.setAddress1("Yemen, Sanaa");
		sup.setAddress2("Hadah Street");
		sup.setCity("Sanna");
		sup.setState("Sanaa");
		sup.setPostalcode("01660");
		sup.setCountry("Yemen");
		sup.setPhone("023786543");
		sup.setFax("012665288");
		sup.setEmail("Tech.211@hotmail.com");
		sup.setUrl("HTTP://TECH.COM");
		sup.setPaymentMethods("online");
		sup.setDiscountType("Regular");
		sup.setTypeGoods("Elec");
		sup.setNotes("Make sure goods ship safety");
		sup.setCurrentOrder("Process");
		sup.setLogo("T__H__C");
		sup.setCustomerId(277885552);
		
		System.out.println("Supplier id :"+sup.getSupplierId());
		System.out.println("Company name :"+sup.getCompanyName());
		System.out.println("First name :"+sup.getContact_fName());
		System.out.println("Last name :"+sup.getContact_lName());
		System.out.println("Title :"+sup.getContact_title());
		System.out.println("Address1 :"+sup.getAddress1());
		System.out.println("Address2 :"+sup.getAddress2());
		System.out.println("City :"+sup.getCity());
		System.out.println("State :"+sup.getState());
		System.out.println("Postal code :"+sup.getPostalcode());
		System.out.println("Country :"+sup.getCountry());
		System.out.println("Phone number :"+sup.getPhone());
		System.out.println("Fax :"+sup.getFax());
		System.out.println("Email :"+sup.getEmail());
		System.out.println("Url :"+sup.getUrl());
		System.out.println("Payment method :"+sup.getPaymentMethods());
		System.out.println("Discount type :"+sup.getDiscountType());
		System.out.println("Type goods :"+sup.getTypeGoods());
		System.out.println("Notes :"+sup.getNotes());
		System.out.println("Discount available :"+sup.getDiscountAvailabe());
		System.out.println("Current order :"+sup.getCurrentOrder());
		System.out.println("Logo :"+sup.getLogo());
		System.out.println("Customer Id :"+sup.getCustomerId());

	}

}

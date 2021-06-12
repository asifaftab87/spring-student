package org.la.student.barry.clas.task;

public class Suppliers {
	/*
	 * 	Create a class Suppliers having member variables supplierId, companyName, contact_fName, 
	 * contact_lName, contact_title, address1, address2, city, state, postalcode, country, phone, fax, 
	 * email,url, paymentMethods, discountType, typeGoods_, notes, discountAvailabe, currentOrder, logo, 
	customerId. create getters and setters for all member variables.
	 Create object of Suppliers class in other class inside main method and set all member values 
	 and print all member values using getters.
						
	 */
	
	private int supplierId;
	private String companyName, contact_fName,contact_lName,contact_title,address1,address2,city,state;
	private String postalcode,country,phone,fax,email,url,paymentMethods,discountType,typeGoods_,notes;
	private String discountAvailabe,currentOrder,logo;
	private int customerId;
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int i) {
		supplierId=i;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String cn) {
		companyName=cn;
	}
	public String getContact_fName() {
		return contact_fName;
	}
	public void setContact_fName(String cf) {
		contact_fName=cf;
	}
	public String getContact_lName() {
		return contact_lName;
	}
	public void setContact_lName(String cl) {
		contact_lName=cl;
	}
	public String getContact_title() {
		return contact_title;
	}
	public void setContact_title(String ct) {
		contact_title=ct;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String a1) {
		address1=a1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String a2) {
		address1=a2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String ci) {
		city=ci;
	}
	public String getState() {
		return state;
	}
	public void setState(String s) {
		state=s;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String p) {
		postalcode=p;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String c) {
		country=c;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String p) {
		phone=p;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String f) {
		fax=f;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String em) {
		email=em;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String u) {
		url=u;
	}
	public String getPaymentMethods() {
		return paymentMethods;
	}
	public void setPaymentMethods(String pm) {
		paymentMethods=pm;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String dp) {
		discountType=dp;
	}
	public String getTypeGoods_() {
		return typeGoods_;
	}
	public void setTypeGoods_(String tg) {
		typeGoods_=tg;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String n) {
		notes=n;
	}
	public String getDiscountAvailabe() {
		return discountAvailabe;
	}
	public void setDiscountAvailabe(String da) {
		discountAvailabe=da;
	}
	public String getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(String co) {
		currentOrder=co;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String lg) {
		logo=lg;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int ci) {
		customerId=ci;
	}
}

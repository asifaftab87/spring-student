package org.la.student.bakil.objects;
/*
 * Create a class Suppliers having member variables supplierId, companyName, contact_fName, contact_lName, contact_title, 
 * address1, address2, city, state, postalcode, 
   country, phone, fax, email,url, paymentMethods, discountType, typeGoods_, notes, discountAvailabe, currentOrder, logo, customerId. 
   create getters and setters for all member variables. 
   Create object of Suppliers class in other class inside main method and set all member values and print all member values using getters.
 */
public class Suppliers {

	
	private int supplierId;
	private String companyName,contact_fName,contact_lName,contact_title,address1,address2,city,state,postalcode,country,phone,
	fax,email,url,paymentMethods,discountType,typeGoods,notes,discountAvailabe,currentOrder,logo;
	private int customerId;
	
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int si) {
		supplierId = si;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String con) {
		companyName = con;
	}
	
	
	public String getContact_fName() {
		return contact_fName;
	}
	public void setContact_fName(String cof) {
		contact_fName = cof;
	}
	
	
	public String getContact_lName() {
		return contact_lName;
	}
	public void setContact_lName(String col) {
		contact_lName = col;
	}
	
	
	public String getContact_title() {
		return contact_title;
	}
	public void setContact_title(String ct) {
		contact_title = ct;
	}
	
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String ad1) {
		address1 = ad1;
	}
	
	
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String ad2) {
		address2 = ad2;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String ci) {
		city = ci;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String stt) {
		state = stt;
	}
	
	
	
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String pos) {
		postalcode = pos;
	}
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String cu) {
		country = cu;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String ph) {
		phone = ph;
	}
	
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fx) {
		fax = fx;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String em) {
		email = em;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String ur) {
		url = ur;
	}
	
	
	public String getPaymentMethods() {
		return paymentMethods;
	}
	public void setPaymentMethods(String pym) {
		paymentMethods = pym;
	}
	
	
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String dis) {
		discountType = dis;
	}
	
	
	public String getTypeGoods() {
		return typeGoods;
	}
	public void setTypeGoods(String tg) {
		typeGoods = tg;
	}
	
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String not) {
		notes = not;
	}
	
	
	public String getDiscountAvailabe() {
		return discountAvailabe;
	}
	public void setDiscountAvailabe(String disc) {
		discountAvailabe = disc;
	}
	
	
	public String getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(String cro) {
		currentOrder = cro;
	}
	
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String log) {
		logo = log;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int cui) {
		customerId = cui;
	}
	
	
	
}

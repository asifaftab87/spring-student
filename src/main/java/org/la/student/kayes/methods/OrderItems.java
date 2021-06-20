package org.la.student.kayes.methods;

public class OrderItems {
	private int orderId;
	private int productId;
	private int quantity;
	
	public int getId()
	{
		return orderId;
	}
	public void setId(int i)
	{
		orderId=i;
	}
	
	public int getProduct()
	{
		return productId;
	}
	public void setProduct(int p)
	{
		productId=p;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int q)
	{
		quantity=q;
	}

}

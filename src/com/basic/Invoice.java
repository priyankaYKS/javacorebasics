package com.basic;

public class Invoice {
	String partNumber;
	String description;
double quantity;
	int item;
	double price,amount;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void getInvoiceAmount(double quatity ,double price) {
		{
			double q =quatity;
			double p=price;
	    	double	amount=q * p;
			System.out.println(amount);
			
		}
	}
	public static void main(String[] args) {
		
Invoice invoice=new Invoice();
invoice.setPrice(100.0);
invoice.setQuality(100);
invoice.getInvoiceAmount(10.0, 20.0);






	}
	private void getInvoivceAmount() {
		// TODO Auto-generated method stub
		
	}
	private void setQuality(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}

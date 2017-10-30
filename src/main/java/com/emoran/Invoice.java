package com.emoran;

import java.util.List;

public class Invoice {
	public String fullCustomerName;
	public String txnDate;
	public BillAddress billAddress;
	public String refNumber;
	public String pONumber;
	public String memo;
	public String salesforceId;
	public String IsPaid;
	public List<InvoiceLineAdd> invoiceLineAddArray;
	
	
	public class BillAddress{
		public String addr1;
		public String city;
		public String state;
		public String postalCode;
		public String country;
	}
	
	public static class InvoiceLineAdd{
		public String itemFullName;
		public String description;
		public Integer quantity;
		public double rate;
	}
}

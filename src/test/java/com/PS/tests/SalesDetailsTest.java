package com.PS.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PS.base.Base;

import com.PS.pages.Login;
import com.PS.pages.SalesDetailsPage;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;

@Listeners(CustomListener.class)
public class SalesDetailsTest extends Base {
	
	SalesDetailsPage salesDetails;
	
	@Test(enabled = false)
	public void CreateSalesQuote() throws Exception {
		
		Utility.logger();
		salesDetails = new SalesDetailsPage();
		create_extent_test("Create sales quote");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		salesDetails.salesQuoteCreate();
		Thread.sleep(1000);
		
	}
	
	
	@Test(enabled = false)
	public void CreateSalesInvoice() throws Exception {
		
		Utility.logger();
		salesDetails = new SalesDetailsPage();
		create_extent_test("Create sales Invoice");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		salesDetails.salesInvoiceCreate();
		Thread.sleep(1000);
		
	}
	
	
	@Test(enabled = true)
	public void CreateCreditMemo() throws Exception {
		
		Utility.logger();
		salesDetails = new SalesDetailsPage();
		create_extent_test("Create Credit Memo");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(2000);
		salesDetails.creditMemoCreate();
		Thread.sleep(1000);
		
	}
	


}

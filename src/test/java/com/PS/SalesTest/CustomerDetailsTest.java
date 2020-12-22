package com.PS.SalesTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.CustomerDetailsPage;
import com.listener.CustomListener;
import com.util.Utility;

@Listeners(CustomListener.class)
public class CustomerDetailsTest extends Base {
	CustomerDetailsPage custDetails;
	public String totalCustCount;

	/*@Test(priority = 1, enabled = true)
	public void CreateCustomer() throws Exception {
        System.out.println("1");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer/ Search Customer validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		custDetails.createCustomer();

	}*/

	/*@Test(priority = 2, enabled = true)
	public void UploadCustomer() throws Exception {
		System.out.println("2");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Upload Custoemr validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.uploadCustomer();

	}*/

	@Test(priority = 3, enabled = true)
	public void UpdateCustomer() throws Exception {
		System.out.println("3");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Update Customer Validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.updateCustomer();

	}

	@Test(priority = 4, enabled = true)
	public void CreateCustomerNegative() throws Exception {
		System.out.println("4");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer Negative Scenario");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.createCustomerNegative();
	}

	/*@Test(priority = 5, enabled = true)
	public void searchCustomer() throws Exception {
		System.out.println("5");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Search Customer Validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.searchCustomer();
		Thread.sleep(1000);
	}*/

/*	@Test(priority = 6, enabled = true)
	public void CustomerLogActivity() throws Exception {
		System.out.println("6");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Log Activity");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogActivity();
	}*/

	/*@Test(priority = 7, enabled = true)
	public void CustomerLogCommunication() throws Exception {
		System.out.println("7");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Log Communication");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogCommunication();
	}*/

	/*@Test(priority = 8, enabled = true)
	public void CustomerSalesOrder() throws Exception {
		System.out.println("8");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Sales Order creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.SalesOrdeCustomer();
	}*/

	/*@Test(priority = 9, enabled = true)
	public void CustomerSalesInvoice() throws Exception {
		System.out.println("9");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Sales Invoice creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.SalesInvoiceCustomer();
	}*/

	/*@Test(priority = 10, enabled = true)
	public void CustomerCreditMemo() throws Exception {
		System.out.println("10");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Credit Memo creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CreditMemoCustomer();
	}*/

	/*@Test(priority = 11, enabled = true)
	public void CustomerDelete1() throws Exception {
		System.out.println("11");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Deleting Customers with Transactions verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.DeleteCustomerTrans();
	}*/

	@Test(priority = 12, enabled = true)
	public void CustomerDelete2() throws Exception {
		System.out.println("12");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Deleting Customers verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.DeleteCustomer();
	}

	/*@Test(priority = 13, enabled = true)
	public void ShowContactValidation() throws Exception {
		System.out.println("13");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Show Contact verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.ShowContact();
	}*/

	/*@Test(priority = 14, enabled = true)
	public void ShowAddrerssValidation() throws Exception {
		System.out.println("14");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Show Address verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.ShowAddress();
	}*/

	/*@Test(priority = 15, enabled = true)
	public void TransactionAllValidation() throws Exception {
		System.out.println("15");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("All Transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionAll();
	}*/

	/*@Test(priority = 16, enabled = true)
	public void TransactionSalesOrderValidation() throws Exception {
		System.out.println("16");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Sales odrer transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionSalesOrder();
	}*/

	/*@Test(priority = 17, enabled = true)
	public void TransactionCreditMemoValidation() throws Exception {
		System.out.println("17");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Credit Memo transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionCreditMemo();
	}*/

	/*@Test(priority = 18, enabled = true)
	public void TransactionPaymentValidation() throws Exception {
		System.out.println("18");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Payment transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionPayment();
	}*/

	@Test(priority = 19, enabled = true)
	public void ExcelDownloadValidation() throws Exception {
		System.out.println("19");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Download Excel Files verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustdownloadExcelValidation();
	}

	@Test(priority = 20, enabled = true)
	public void PdfDownloadValidation() throws Exception {
		System.out.println("20");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Download PDF Files verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustdownloadPdfValidation();
	}

	/*@Test(priority = 21, enabled = true)
	public void EmailValid() throws Exception {
		System.out.println("21");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Email Validation ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.EmailValidation();
	}*/

}
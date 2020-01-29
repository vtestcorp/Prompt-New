package com.PS.tests;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PS.base.Base;
import com.PS.pages.CustomerDetails_Page;
import com.PS.pages.login;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;
import com.relevantcodes.extentreports.LogStatus;

import static com.PS.util.Utility.excelReadHssf;

@Listeners(CustomListener.class)
public class NcustomerDetails extends Base {
	CustomerDetails_Page custDetails;
	public String totalCustCount;



	@Test(enabled = true)
	public void CreateCustomer() throws Exception {
		Utility.logger();
		custDetails =new CustomerDetails_Page();
		create_extent_test("Create customer/ Search Customer");
		new login().login( Utility.excelRead(2, 0,"CustomerDetails"),Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		new CustomerDetails_Page().createCustomer();
	}
	@Test(enabled = false)
	public void UploadCustomer() throws Exception {
		Utility.logger();
		create_extent_test("Upload Customer");
		new login().login( Utility.excelRead(2, 0,"CustomerDetails"),Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		new CustomerDetails_Page().uploadCustomer();
	}

	@Test(enabled = false)
	public void customerSearch() throws InterruptedException, IOException {

		Utility.logger();
		custDetails = new CustomerDetails_Page();
		create_extent_test("CUSTOMER SEARCH");
		new login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		Utility.click(custDetails.CustomersMenuBtn);
		Thread.sleep(1000);
		Utility.implicitwait();
		String customerName = custDetails.labelFirstCustomerName.getText();
		Utility.enterText(custDetails.textBoxSearch, customerName);
		if (customerName.equals(custDetails.labelFirstCustomerName.getText())) {
			et.log(LogStatus.PASS, "Matching customer is displayed",
					et.addScreenCapture(pass("Matching customer is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Matching customer is not displayed",
					et.addScreenCapture(fail("Matching customer is not displayed")));
		}

	}

	@Test(enabled = false)
	public void createSalesInvoice() throws InterruptedException, IOException {

		Utility.logger();
		custDetails = new CustomerDetails_Page();
		create_extent_test("CREATE SALES INVOICE");
		new login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		Utility.implicitwait();
		Utility.click(custDetails.buttonPlus);
		Thread.sleep(1000);
		Utility.click(custDetails.linkSalesInvoice);
		if ("Standard Invoice".equals(custDetails.headerSalesInvoice.getText())) {
			et.log(LogStatus.PASS, "New sales invoice page is displayed",
					et.addScreenCapture(pass("New sales invoice page is displayed")));


		} else {
			et.log(LogStatus.FAIL, "New sales invoice page is not displayed",
					et.addScreenCapture(fail("New sales invoice page is not displayed")));
		}
		Thread.sleep(2000);
		Utility.click(custDetails.dropDownCustomer);
		Utility.click(custDetails.optionFirst);
		String dropDownOption = custDetails.optionFirst.getText();
		if (dropDownOption.equals(custDetails.labelSelectedCustomerName.getText())) {
			et.log(LogStatus.PASS, "Customer is selected in customer drop down",
					et.addScreenCapture(pass("Customer is selected in customer drop down")));
		} else {
			et.log(LogStatus.FAIL, "Customer is not selected in customer drop down",
					et.addScreenCapture(fail("Customer is not selected in customer drop down")));
		}
		if ("".equals(custDetails.textBoxRefNo.getText())) {
			et.log(LogStatus.PASS, "Ref no is not reflecting on invoice",
					et.addScreenCapture(pass("Ref no is not reflecting on invoice")));
		} else {
			et.log(LogStatus.FAIL, "Ref no is reflecting on invoice",
					et.addScreenCapture(fail("Ref no is reflecting on invoice")));
		}

	}

	@Test(enabled = false)
	public void customerUpdate() throws InterruptedException, IOException {
		Utility.logger();
		create_extent_test("Customer Update");
		new login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		new CustomerDetails_Page().updateCustomer();

	}


}
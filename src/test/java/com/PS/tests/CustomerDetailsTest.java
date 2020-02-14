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
import com.PS.pages.CustomerDetailsPage;
import com.PS.pages.Login;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;
import com.relevantcodes.extentreports.LogStatus;

import static com.PS.util.Utility.excelReadHssf;

@Listeners(CustomListener.class)
public class CustomerDetailsTest extends Base {
	CustomerDetailsPage custDetails;
	public String totalCustCount;

	@Test(enabled = true)
	public void CreateCustomer() throws Exception {
		
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer/ Search Customer");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		custDetails.createCustomer();
		Thread.sleep(1000);
		custDetails.searchCustomer();
	}

	

	@Test(enabled = false)
	public void UploadCustomer() throws Exception {
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Upload Custoemr");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(3000);
		custDetails.uploadCustomer();
		Thread.sleep(1000);
		
	}

	@Test(enabled = true)
	public void UpdateCustomer() throws Exception {
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Update Customer");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.updateCustomer();
		Thread.sleep(1000);
		
	}
	
	
	@Test(enabled = true)
	public void CreateCustomerNegative() throws Exception {
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer Negative");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(3000);
		custDetails.createCustomerNegative();
	}

	@Test(enabled = true)
	public void customerSearch() throws InterruptedException, IOException {
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Search");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
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

	@Test(enabled = true)
	public void CustomerLogActivity() throws Exception
	{
		Utility.logger();
		custDetails =new CustomerDetailsPage();
		create_extent_test("Customer Log Activity");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogActivity();
	}

	@Test(enabled = false)
	public void CustomerLogCommunication() throws Exception
	{
		Utility.logger();
		custDetails =new CustomerDetailsPage();
		create_extent_test("Customer Log Communication");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogCommunication();
	}
	

}
package com.PS.tests;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PS.base.Base;
import com.PS.pages.CustomerDetailsPage;
import com.PS.pages.SupplierDetailsPage;
import com.PS.pages.Login;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListener.class)
public class SupplierDetailsTest extends Base {
	SupplierDetailsPage suppDetails;

	public String totalSuppCount;

	@Test(enabled = false)
	public void CreateSupplier() throws Exception {
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Create supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		Thread.sleep(3000);
		suppDetails.createSupplier();
	}

	@Test(enabled = false)
	public void UploadSupplier() throws Exception {
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Upload supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		Thread.sleep(3000);
		suppDetails.uploadSupplier();
	}

	@Test(enabled = false)
	public void UpdateSupplier() throws Exception {
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Update Supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.updateSupplier();
		Thread.sleep(4000);
	}

	@Test(enabled = true)
	public void CreateSupplierNegative() throws Exception {
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Create supplier Negative Scenario");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		Thread.sleep(3000);
		suppDetails.createSupplierNegative();
	}

	@Test(enabled = false)
	public void SupplierSearch() throws InterruptedException, IOException {
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Supplier Search");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		Thread.sleep(2000);
		Utility.click(suppDetails.SupplierMenuBtn);
		Thread.sleep(1000);
		Utility.implicitwait();
		String supplierName = suppDetails.labelFirstSupplierName.getText();
		Utility.enterText(suppDetails.searchbox1, supplierName);
		if (supplierName.equals(suppDetails.labelFirstSupplierName.getText())) {
			et.log(LogStatus.PASS, "Matching customer is displayed",
					et.addScreenCapture(pass("Matching Supplier is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Matching Supplier is not displayed",
					et.addScreenCapture(fail("Matching Supplier is not displayed")));
		}
	}

}

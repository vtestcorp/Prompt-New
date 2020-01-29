package com.PS.tests;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PS.base.Base;
import com.PS.pages.InventoryDetails_Page;
import com.PS.pages.login;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListener.class)
public class InventoryDetails extends Base {
	InventoryDetails_Page inventoryDetails_Page;

	@Test(enabled = false)
	public void productSearch() throws InterruptedException, IOException {

		Utility.logger();
		inventoryDetails_Page = new InventoryDetails_Page();
		create_extent_test("PRODUCT SEARCH");
		new login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		Utility.implicitwait();
		Utility.click(inventoryDetails_Page.inventoryMenuBtn);
		Thread.sleep(1000);
		Utility.click(inventoryDetails_Page.productsSubMenuBtn);
		String productName = inventoryDetails_Page.labelFirstProductName.getText();
		Utility.enterText(inventoryDetails_Page.textBoxSearch, productName);
		if (productName.equals(inventoryDetails_Page.labelFirstProductName.getText())) {
			et.log(LogStatus.PASS, "Matching items is displayed",
					et.addScreenCapture(pass("Matching items is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Matching items is not displayed",
					et.addScreenCapture(fail("Matching items is not displayed")));
		}

	}

	@Test(enabled = true)
	public void createInventory() throws InterruptedException, IOException {

		Utility.logger();
		inventoryDetails_Page = new InventoryDetails_Page();
		create_extent_test("CREATE INVENTORY");
		new login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		Utility.implicitwait();
		Utility.click(inventoryDetails_Page.inventoryMenuBtn);
		Thread.sleep(1000);
		Utility.click(inventoryDetails_Page.productsSubMenuBtn);
		Thread.sleep(2000);
		Utility.click(inventoryDetails_Page.buttonNewProduct);
		Thread.sleep(2000);
		Utility.enterText(inventoryDetails_Page.textBoxProductName, "dhdhdhhj");
		Utility.enterText(inventoryDetails_Page.textBoxProductDescription, "hhys");
		Utility.click(inventoryDetails_Page.buttonWareHouse);
		Thread.sleep(2000);
		Utility.click(inventoryDetails_Page.dropdownWareHouse);
		Utility.click(inventoryDetails_Page.dropdownWareHouseOption);
		Utility.click(inventoryDetails_Page.buttonSubmit);
		Thread.sleep(2000);
		Utility.click(inventoryDetails_Page.buttonPopUpSubmit);
		for (int i = 0; i < inventoryDetails_Page.labelProductNames.size(); i++) {
			if (inventoryDetails_Page.labelProductNames.get(i).getText().equals("dhdhdhhj")) {
				et.log(LogStatus.PASS, "New inventory is created successfully",
						et.addScreenCapture(pass("New inventory is created successfully")));
				break;
			} else if (i == inventoryDetails_Page.labelProductNames.size()) {
				et.log(LogStatus.FAIL, "New inventory is not created",
						et.addScreenCapture(fail("New inventory is not created")));
			}
		}

	}

}
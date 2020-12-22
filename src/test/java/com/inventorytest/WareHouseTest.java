package com.inventorytest;

import org.testng.annotations.Test;

import com.base.Base;
import com.inventory.WareHouseDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class WareHouseTest extends Base {

	WareHouseDetailsPage wareHouseDetails;

	@Test(enabled = true)
	public void WarehouseCreation() throws Exception {
        System.out.println("1");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("creating new warehouse ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.CreateWareHouse();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void WarehouseCreationNegative() throws Exception {
		System.out.println("2");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse negative validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.CreateWareHouseNegative();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void WarehouseDeleteItems() throws Exception {
		System.out.println("3");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse with Items delete validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.DeleteWareHouseItems();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void WarehouseDelete() throws Exception {
		System.out.println("4");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse without delete validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.DeleteWareHouse();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void WarehouseUpdate() throws Exception {
		System.out.println("5");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.UpdateWareHouse();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void ValidationstockSummary() throws Exception {
		System.out.println("6");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockSummaryValidation();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void ValidationstockVariant() throws Exception {
		System.out.println("7");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockVariantValidation();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void ValidationstockAdjustment() throws Exception {
		System.out.println("8");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("Stock Adjusment validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockAdjustmentValidation();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void ValidationAgedStock() throws Exception {
		System.out.println("9");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("Aged Stock validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.AgedStockValidation();
		Thread.sleep(2000);

	}

}

package com.inventorytest;

import org.testng.annotations.Test;

import com.base.Base;
import com.inventory.ProductsDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class ProductsDetailsTest extends Base {

	ProductsDetailsPage inventoryDetails;

	@Test(enabled = true, priority = 1)
	public void NegativeInventoryValidation() throws Exception {
        System.out.println("1");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Negative validation ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.InventoryNegative();
		Utility.implicitwait();

	}

	/*@Test(enabled = true, priority = 2)
	public void ValidationAttribute() throws Exception {
        System.out.println("2");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Variant attribute validation ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.VariantAttributeValidation();
		Utility.implicitwait();

	}*/

	/*@Test(enabled = true, priority = 3)
	public void ValidationImportProduct() throws Exception {
        System.out.println("3");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Import product from excel validation ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.ImportProductValidation();
		Utility.implicitwait();

	}*/

	/*@Test(enabled = true, priority = 4)
	public void ValidationDuplicateSKU() throws Exception {
        System.out.println("4");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Duplicate SKU number validation ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.DuplicateSKUValidation();
		Utility.implicitwait();
	}*/

	/*@Test(enabled = true, priority = 5)
	public void ValidationVariantPopUP() throws Exception {
        System.out.println("5");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Variant PopUp validation ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.VariantPopUPValidation();
		Utility.implicitwait();

	}*/

/*	@Test(enabled = true, priority = 6)
	public void ValidationCreateProduct() throws Exception {
        System.out.println("6");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Create Product and product link validation ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.CreateProductValidation();
		Utility.implicitwait();

	}*/

	@Test(enabled = true, priority = 7)
	public void ValidationDownloadExcel() throws Exception {
        System.out.println("7");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Download PDF File validation ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.downloadExcelValidation();
		Utility.implicitwait();

	}

	@Test(enabled = true, priority = 8)
	public void ValidationDownloadPDF() throws Exception {
        System.out.println("8");
		Utility.logger();
		inventoryDetails = new ProductsDetailsPage();
		create_extent_test("Download PDF File validation ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		inventoryDetails.downloadpdfValidation();
		Utility.implicitwait();

	}

}

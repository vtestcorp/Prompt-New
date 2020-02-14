package com.PS.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.http.DateGenerator;
import org.testng.Assert;

import com.PS.base.Base;
import com.PS.util.Utility;
import com.relevantcodes.extentreports.LogStatus;

import jxl.biff.drawing.CheckBox;

public class SupplierDetailsPage extends Base {

	boolean custext;

	@FindBy(xpath = "//input[@name='Maharashtra']")
	public WebElement selectstate1;

	@FindBy(xpath = "//li[@name='Dr.']")
	public WebElement Title;

	@FindBy(xpath = "//a[contains(@href,'admin/suppliers')]")
	public WebElement SupplierMenuBtn;

	@FindBy(xpath = "//button[contains(text(),'New Supplier')]")
	public WebElement newSupplier;

	@FindBy(xpath = "//input[@placeholder='Enter Supplier Name']")
	public WebElement supplierName;

	@FindBy(xpath = "//div[contains(text(),'Select Payment')]")
	public WebElement selectPaymentTerm;

	@FindBy(xpath = "//li[@name='Showroom']")
	public WebElement supplierTypeShowroom;

	@FindBy(xpath = "//div[contains(text(),'Supplier Type')]")
	public WebElement supplierType;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement supplierWebsite;

	@FindBy(xpath = "//div[contains(text(),'Supplier Source')]")
	public WebElement supplierSource;

	@FindBy(xpath = "//li[@name='Conference']")
	public WebElement supplierSourceName;

	@FindBy(xpath = "//input[@placeholder='Relationship Since Date']")
	public WebElement relationshipDate;

	@FindBy(xpath = "//a[text()='Today']/parent::span")
	public WebElement relationshipDate1;

	@FindBy(xpath = "//div[contains(text(),'Select Industry')]")
	public WebElement industry;

	@FindBy(xpath = "//li[@name='Media']")
	public WebElement mediaIndustry;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitSupplier;

	@FindBy(xpath = "//input[@placeholder='Street Name']") // Street Name
	public WebElement streetname1;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement city1;

	@FindBy(xpath = "//div[text()='State']/parent::div")
	public WebElement state1;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode1;

	@FindBy(xpath = "(//div[text()='Select Country'])[1]")
	public WebElement country1;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement save1;

	@FindBy(xpath = "//span[text()='Shipping address same as billing']/parent::label")
	public WebElement sameAsBillingAddress1;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	public WebElement contact;

	@FindBy(xpath = "//div[text()='Select Title']")
	public WebElement selectTitle;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	public WebElement MiddleName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Call Name']")
	public WebElement CallName;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement Phone;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile;

	@FindBy(xpath = "//input[@placeholder='Fax Number']")
	public WebElement FaxNumber;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement Email;

	@FindBy(xpath = "//div[@role=\"tab\" and text()=\"Tax Information\"]")
	public WebElement tax;

	@FindBy(xpath = "//div[contains(text(),'Select GST Mechanism')]")
	public WebElement GstMech;

	@FindBy(xpath = "//input[@placeholder='Enter GSTIN']")
	public WebElement GstNum;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum;

	@FindBy(xpath = "//span[@class='ant-form-item-children']//span[@class='ant-checkbox']")
	public WebElement checkBox1;

	@FindBy(xpath = "//div[@role='tab' and text()=\"Logo\"]	")
	public WebElement logo;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public WebElement uploadButton;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement saveNew;

	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement saveNew1;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalSupplierCount;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters supplier name']")
	public WebElement searchbox1;

	@FindBy(xpath = "//div[@aria-rowindex='2']//button[1]")
	public WebElement update_first_supplier;

	@FindBy(xpath = "//li[@class='ant-dropdown-menu-item']")
	public WebElement editSupplier;

	@FindBy(xpath = "//a[contains(text(),'Glory Rubber (P) Ltd')]")
	public WebElement labelName;

	@FindBy(xpath = "//li[text()='Import Supplier']")
	public WebElement newSupplierDropdown;

	@FindBy(xpath = "//span[text()='Next']/parent::button")
	public WebElement NextbtnNew;

	@FindBy(xpath = "//span[text()='Done']/parent::button")
	public WebElement NextbtnNew2;

	@FindBy(xpath = "//div[@class='ant-upload ant-upload-drag']")
	public WebElement chooseFileNew;

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	public WebElement close1;
	
	@FindBy(xpath = "//a[@class='company-name'][1]")
	public WebElement labelFirstSupplierName;

	public SupplierDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////////////// Creating Supplier //////////////////////////////////////////

	public void createSupplier() throws Exception {
		Utility.click(SupplierMenuBtn);
		Thread.sleep(1000);
		Utility.JS_Scrolldown(totalSupplierCount);
		Thread.sleep(1000);
		String totalSuppCount = null;
		if (totalSupplierCount.isDisplayed()) {
			totalSuppCount = totalSupplierCount.getText();
			System.out.println("Expected " + totalSuppCount);
		} else {
			System.out.println("Not Displayed");
		}
		Thread.sleep(1000);
		Utility.click(newSupplier);
		Thread.sleep(1000);
		Utility.ExcelReadAndWrite(2, 2);
		Utility.implicitwait();
		Utility.enterText(supplierName, Utility.excelRead(2, 2, "SupplierDetails"));
		Thread.sleep(2000);
		Utility.click(selectPaymentTerm);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 3, "SupplierDetails") + "']")).click();
		Utility.click(supplierType);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 4, "SupplierDetails") + "']")).click();
		Utility.enterText(supplierWebsite, Utility.excelRead(2, 5, "SupplierDetails"));
		Utility.click(supplierSource);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 6, "SupplierDetails") + "']")).click();
		Utility.click(industry);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 8, "SupplierDetails") + "']")).click();
		Utility.click(relationshipDate);
		Utility.click(relationshipDate1);
		Thread.sleep(2000);
		Utility.enterText(streetname1, Utility.excelRead(2, 9, "SupplierDetails"));
		Utility.enterText(city1, Utility.excelRead(2, 10, "SupplierDetails"));
		Utility.enterText(zipcode1, Utility.excelRead(2, 12, "SupplierDetails"));
		Utility.JS_Scrolldown(saveNew);
		Utility.click(country1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 32, "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//li/span[text()='India']")).click();
		Thread.sleep(5000);
		Utility.click(state1);
		Thread.sleep(2000);
		Utility.click(selectstate1);
		Thread.sleep(1000);
		Utility.click(sameAsBillingAddress1);
		Utility.click(contact);
		Thread.sleep(1000);
		Utility.click(selectTitle);
		Thread.sleep(1000);
		Utility.click(Title);
		Thread.sleep(1000);
		Utility.enterText(FirstName, Utility.excelRead(2, 36, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(MiddleName, Utility.excelRead(2, 37, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(LastName, Utility.excelRead(2, 38, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(CallName, Utility.excelRead(2, 39, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Phone, Utility.excelRead(2, 40, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Mobile, Utility.excelRead(2, 41, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(FaxNumber, Utility.excelRead(2, 42, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Email, Utility.excelRead(2, 43, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.click(tax);
		Thread.sleep(1000);
		Utility.click(GstMech);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 44, "SupplierDetails") + "']")).click();
		Thread.sleep(1000);
		Utility.enterText(GstNum, Utility.excelRead(2, 45, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(PanNum, Utility.excelRead(2, 46, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.click(checkBox1);
		Thread.sleep(1000);
		Utility.click(logo);
		Utility.click(uploadButton);
		File file1 = new File(prop.getProperty("Logo"));
		StringSelection strSelection1 = new StringSelection(file1.getAbsolutePath());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection1, null);
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Utility.click(saveNew);
		Thread.sleep(3000);
		Utility.click(saveNew1);
		Thread.sleep(3000);
		String totalsupplCountCurrent = totalSupplierCount.getText();
		System.out.println("Actual" + totalsupplCountCurrent);
		Thread.sleep(1000);
		try {
			Assert.assertNotEquals(totalSuppCount, totalsupplCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Supplier Created and count got increased",
					et.addScreenCapture(pass("New Supplier is Created and count got increased")));
		} catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Supplier Count hasn't increased",
					et.addScreenCapture(fail("Supplier Count hasn't increased")));
		}
	}

//////////////////////////// Upload Supplier //////////////////////////////////////////

	public void uploadSupplier() throws Exception {
		Utility.click(SupplierMenuBtn);
		Thread.sleep(1000);
		String totalSuppCount = null;
		Utility.JS_Scrolldown(totalSupplierCount);
		Thread.sleep(1000);
		if (totalSupplierCount.isDisplayed()) {
			totalSuppCount = totalSupplierCount.getText();
			System.out.println("Expected " + totalSuppCount);
		} else {
			System.out.println("Not Displayed");
		}
		new Actions(driver).moveToElement(newSupplier).perform();
		Utility.click(newSupplierDropdown);
		Thread.sleep(1000);
		Utility.click(NextbtnNew);
		chooseFileNew.click();
		File f4 = new File(prop.getProperty("ImportCustomers1"));
		StringSelection strSelection2 = new StringSelection(f4.getAbsolutePath());
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(strSelection2, null);
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Utility.click(NextbtnNew2);
		Thread.sleep(1000);
		Utility.ActionClick(close1);
		Thread.sleep(2000);
		String importSupp = new String(Utility.excelReadHssf(1, 0, "ImportCustomers1"));
		System.out.println(importSupp);
		Utility.enterText(searchbox1, importSupp);
		Thread.sleep(2000);
		try {

			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(1, 0, "ImportCustomers1") + "']"));
			custext = true;
		} catch (Exception e) {
			custext = false;
		}
		Thread.sleep(1000);
		try {
			Assert.assertEquals(custext, true, "Supplier not created");
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created Supplier name found",
					et.addScreenCapture(fail("New created Supplier name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created Suppleir name found",
					et.addScreenCapture(pass("New created Supplier name not found")));
			System.out.println("search mismatched ");
		}
		String totalSuppCountCurrent = totalSupplierCount.getText();
		System.out.println("Actual" + totalSuppCount);
		Thread.sleep(1000);
		try {

			Assert.assertNotEquals(totalSupplierCount, totalSuppCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Supplier Created and count got increased",
					et.addScreenCapture(pass("New Supplier is Created and count got increased")));
		} catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Supplier Count hasn't increased",
					et.addScreenCapture(fail("Supplier Count hasn't increased")));
		}
	}

//////////////////////////// Update supplier //////////////////////////////////////////

	public void updateSupplier() throws Exception {
		Utility.click(SupplierMenuBtn);
		Thread.sleep(1000);
		Utility.implicitwait();
		Utility.click(update_first_supplier);
		Thread.sleep(2000);
		Utility.click(editSupplier);
		Thread.sleep(2000);
		String newname1 = "Glory Rubber (P) Ltd";
		Utility.enterText(supplierName, newname1);
		Utility.JS_Scrolldown(saveNew);
		Thread.sleep(2000);
		Utility.click(saveNew);
		Thread.sleep(2000);
		Utility.click(saveNew1);
		String label = labelName.getText();
		Utility.enterText(searchbox1, newname1);
		if (newname1.equals(label)) {
			et.log(LogStatus.PASS, "Matching supplier is displayed",
					et.addScreenCapture(pass("Matching supplier is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Matching supplier is not displayed",
					et.addScreenCapture(fail("Matching supplier is not displayed")));
		}
	}

////////////////////////////creating Supplier Negative Scenario //////////////////////////////////////////

	public void createSupplierNegative() throws InterruptedException, IOException {
		Utility.click(SupplierMenuBtn);
		Thread.sleep(1000);
		Utility.JS_Scrolldown(totalSupplierCount);
		Thread.sleep(1000);
		String totalSuppCount = null;
		if (totalSupplierCount.isDisplayed()) {
			totalSuppCount = totalSupplierCount.getText();
			System.out.println("Expected " + totalSuppCount);
		} else {
			System.out.println("Not Displayed");
		}
		Thread.sleep(1000);
		Utility.click(newSupplier);
		Thread.sleep(1000);
		Utility.ExcelReadAndWrite(2, 2);

		Thread.sleep(2000);
		Utility.click(selectPaymentTerm);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 3, "SupplierDetails") + "']")).click();
		Utility.click(supplierType);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 4, "SupplierDetails") + "']")).click();
		Utility.enterText(supplierWebsite, Utility.excelRead(2, 5, "SupplierDetails"));
		Utility.click(supplierSource);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 6, "SupplierDetails") + "']")).click();
		Utility.click(industry);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 8, "SupplierDetails") + "']")).click();
		Thread.sleep(1000);
		Utility.click(relationshipDate);
		Thread.sleep(1000);
		Utility.click(relationshipDate1);
		Thread.sleep(2000);
		Utility.enterText(streetname1, Utility.excelRead(2, 9, "SupplierDetails"));

		Utility.enterText(zipcode1, Utility.excelRead(2, 12, "SupplierDetails"));
		Utility.JS_Scrolldown(saveNew);
		Utility.click(country1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 32, "SupplierDetails") + "']")).click();
		Thread.sleep(2000);

		Utility.click(sameAsBillingAddress1);
		Utility.click(saveNew);
		WebElement errorText1 = driver.findElement(By.xpath("//span[@class='text-red']"));
		String error = errorText1.getText();
		try {
			Assert.assertNotEquals(errorText1, error);
			System.out.println("error message disaplyed");
			et.log(LogStatus.PASS, "error message is displaying",
					et.addScreenCapture(pass("error message is displaying")));
		} catch (Exception ex) {
			System.out.println("error message not displayed");
			et.log(LogStatus.FAIL, "error message is not displaying",
					et.addScreenCapture(fail("error message is not displaying")));
		}

	}

////////////////////////////Search by Supplier name //////////////////////////////////////////

	public void searchSupplier() throws Exception {

		Utility.enterText(searchbox1, Utility.excelRead(2, 2, "SupplierDetails"));
		boolean supptext;
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(2, 2, "SupplierDetails") + "']"));
			supptext = true;
		} catch (Exception e) {
			supptext = false;
		}
		Thread.sleep(1000);
		try {
			Assert.assertEquals(supptext, true, "Supplier not created");
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created Supplier name found",
					et.addScreenCapture(fail("New created Supplier name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created Supplier name found",
					et.addScreenCapture(pass("New created supplier name not found")));
			System.out.println("search mismatched ");

		}
	}

}

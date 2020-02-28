package com.PS.pages;

import java.awt.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.tools.ant.taskdefs.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PS.base.Base;
import com.PS.util.Utility;
import com.relevantcodes.extentreports.LogStatus;

import jxl.common.Assert;

public class SalesDetailsPage extends Base {

/////////////////////Sales Quote////////////////////////////////////////

	String customerPO = Utility.excelRead(7, 1, "CustomerDetails");
	String rfqNum = Utility.excelRead(7, 1, "CustomerDetails");
	String refNum = Utility.excelReadInt(7, 2, "CustomerDetails");
	String descp = Utility.excelRead(7, 8, "CustomerDetails");
	String expense = Utility.excelReadInt(7, 10, "CustomerDetails");

	String Quantity = Utility.excelRead(7, 3, "CustomerDetails");
	String HSN = Utility.excelRead(7, 4, "CustomerDetails");
	String Rate = Utility.excelRead(7, 5, "CustomerDetails");
	String SpclDiscnt = Utility.excelRead(7, 6, "CustomerDetails");
	String discnt = Utility.excelRead(7, 7, "CustomerDetails");

	String Quantity1 = Utility.excelRead(8, 3, "CustomerDetails");
	String HSN1 = Utility.excelRead(8, 4, "CustomerDetails");
	String Rate1 = Utility.excelRead(8, 5, "CustomerDetails");
	String SpclDiscnt1 = Utility.excelRead(8, 6, "CustomerDetails");
	String discnt1 = Utility.excelRead(8, 7, "CustomerDetails");
	String remarks = Utility.excelRead(7, 9, "CustomerDetails");

	/////////// expected elements text///////////

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement subTotalExpctd;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[2]")
	public WebElement discountExpctd;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[3]")
	public WebElement taxExpctd1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[4]")
	public WebElement taxExpctd2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement totalAmountExpctd;

	@FindBy(xpath = "//div[@comp-id='49']")
	public WebElement amountExpctd1;

	@FindBy(xpath = "//div[@comp-id='73']")
	public WebElement amountExpctd2;

////////////// elements for actual////////////

	////// 1st product//////
	@FindBy(xpath = "(//tbody)[1]//tr//td[1]")
	public WebElement rfqNumActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[2]")
	public WebElement refNumActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[3]")
	public WebElement priorityActual;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement productActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[3]")
	public WebElement quantityActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement uomActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement rateActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[6]")
	public WebElement HsnActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[9]")
	public WebElement totalamountActual1;

//////2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement productActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[3]")
	public WebElement quantityActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement uomActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement rateActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[6]")
	public WebElement HsnActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[9]")
	public WebElement totalamountActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[1]")
	public WebElement subtotalActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[2]")
	public WebElement discountActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[3]")
	public WebElement taxActual1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[4]")
	public WebElement taxActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[5]")
	public WebElement grandtotalActual;

	@FindBy(xpath = "//li//i[@class='fa fa-plus']")
	public WebElement addButton;

	@FindBy(xpath = "//a[contains(text(),'Sales Quote')]")
	public WebElement salesQuoteLink;

	@FindBy(xpath = "//a[contains(text(),'Sales Order')]")
	public WebElement salesOrderLink;

	@FindBy(xpath = "//a[contains(text(),'Sales Invoice')]")
	public WebElement salesInvoiceLink;

	@FindBy(xpath = "//a[contains(text(),'Credit Memo')]")
	public WebElement creditMemoLink;

	@FindBy(xpath = "//div[contains(text(),'Select Customer')]")
	public WebElement selectCustomerDropdown;

	@FindBy(xpath = "//div[@comp-id='17']")
	public WebElement customerRFQ;

	@FindBy(xpath = "//div[@class='ag-react-container']//textarea")
	public WebElement customerRFQ1;

	@FindBy(xpath = "//div[@comp-id='18']")
	public WebElement refNumber;

	@FindBy(xpath = "//div[@comp-id='18']//div[@class='ag-react-container']//textarea")
	public WebElement refNumber1;

	@FindBy(xpath = "//div[@comp-id='19']")
	public WebElement priorityDropdown;

	@FindBy(xpath = "//li//span[contains(text(),'Medium')]")
	public WebElement prioritySelect;

	@FindBy(xpath = "//div[@comp-id='44']")
	public WebElement productDropdown;

	@FindBy(xpath = "//ul//li[contains(text(),'waxxe')]")
	public WebElement productSelect;

	@FindBy(xpath = "//div[@comp-id='46']")
	public WebElement quantity;

	@FindBy(xpath = "//div[@comp-id='47']")
	public WebElement Uom;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelect;

	@FindBy(xpath = "//div[@comp-id='48']")
	public WebElement Hsn;

	@FindBy(xpath = "//div[@comp-id='59']")
	public WebElement rate;

	@FindBy(xpath = "//div[@comp-id='60']")
	public WebElement specialDiscount;

	@FindBy(xpath = "//div[@comp-id='61']")
	public WebElement discount;

	@FindBy(xpath = "//div[@comp-id='62']")
	public WebElement tax;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"6\"]")
	public WebElement taxSelect;

	@FindBy(xpath = "//button[contains(text(),'Add Line')]")
	public WebElement addLine;

	@FindBy(xpath = "//div[@comp-id='64']")
	public WebElement productDropdown1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelect1;

	@FindBy(xpath = "//div[@comp-id='45']")
	public WebElement description;

	@FindBy(xpath = "//div[@comp-id='66']")
	public WebElement quantity1;

	@FindBy(xpath = "//div[@comp-id='67']")
	public WebElement Uom1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelect1;

	@FindBy(xpath = "//div[@comp-id='69']")
	public WebElement rate1;

	@FindBy(xpath = "//div[@comp-id='70']")
	public WebElement specialDiscount1;

	@FindBy(xpath = "//div[@comp-id='71']")
	public WebElement discount1;

	@FindBy(xpath = "//div[@comp-id='72']")
	public WebElement tax1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelect1;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public WebElement uploadCustRFQ;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//div//textarea[@placeholder='Will not be visible to the customer. For internal purpose only.']")
	public WebElement internalRemarks;

/////////////////////Sales Invoice ////////////////////////////////////////

	@FindBy(xpath = "//div[@comp-id='21']")
	public WebElement customerPOInvoice;

	@FindBy(xpath = "//div[@comp-id='26']")
	public WebElement placeOFSupplyInvoice;

	@FindBy(xpath = "//div[@comp-id='25']")
	public WebElement paymentTerms;

	@FindBy(xpath = "//div//textarea[@class='editable-cell-textarea']")
	public WebElement customerPOInvoice1;

	@FindBy(xpath = "//div[@comp-id='22']")
	public WebElement refNumberInvoice;

	@FindBy(xpath = "//div[@comp-id='22']//div[@class='ag-react-container']//textarea")
	public WebElement refNumberInvoice1;

	@FindBy(xpath = "//div[@comp-id='50']")
	public WebElement productDropdownInvoice;

	@FindBy(xpath = "//ul//li[contains(text(),'waxxe')]")
	public WebElement productSelectInvoice;

	@FindBy(xpath = "//div[@comp-id='52']")
	public WebElement quantityInvoice;

	@FindBy(xpath = "//div[@comp-id='53']")
	public WebElement UomInvoice;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectInvoice;

	@FindBy(xpath = "//div[@comp-id='54']")
	public WebElement HsnInvoice;

	@FindBy(xpath = "//div[@comp-id='65']")
	public WebElement rateInvoice;

	@FindBy(xpath = "//div[@comp-id='66']")
	public WebElement specialDiscountInvoice;

	@FindBy(xpath = "//div[@comp-id='67']")
	public WebElement discountInvoice;

	@FindBy(xpath = "//div[@comp-id='68']")
	public WebElement taxInvoice;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"6\"]")
	public WebElement taxSelectInvoice;

	/////////////////////////////////////////////////

	@FindBy(xpath = "//div[@comp-id='70']")
	public WebElement productDropdownInvoice1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelectInvoice1;

	@FindBy(xpath = "//div[@comp-id='72']")
	public WebElement quantityInvoice1;

	@FindBy(xpath = "//div[@comp-id='73']")
	public WebElement UomInvoice1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectInvoice1;

	@FindBy(xpath = "//div[@comp-id='74']")
	public WebElement HsnInvoice1;

	@FindBy(xpath = "//div[@comp-id='75']")
	public WebElement rateInvoice1;

	@FindBy(xpath = "(//div[@role=\"gridcell\"])[13]")
	public WebElement specialDiscountInvoice1;

	@FindBy(xpath = "(//div[@role=\"gridcell\"])[14]")
	public WebElement discountInvoice1;

	@FindBy(xpath = "//div[@comp-id='78']")
	public WebElement taxInvoice1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelectInvoice1;

	@FindBy(xpath = "	//button[contains(text(),'Add Line')]")
	public WebElement addLineInvoice;

	@FindBy(xpath = "//div[@class='invoice-details-container']//label[1]//span[1]//input[1]")
	public WebElement discountCheckBox;

	@FindBy(xpath = "//label[2]//span[1]//input[1]")
	public WebElement expenseCheckBox;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[1]")
	public WebElement discountEntry;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[3]")
	public WebElement expenseEntry;

	@FindBy(xpath = "(//div[@role='combobox'])[6]")
	public WebElement expenseDropdown;

	@FindBy(xpath = "//li//span[contains(text(),'Lobour Expense')]")
	public WebElement expenseSelect;

	@FindBy(xpath = "//textarea[@placeholder='Will not be visible to the customer. For internal purpose only.']")
	public WebElement remarksInvoice;

	@FindBy(xpath = "//div[@comp-id='55']")
	public WebElement amountExpctdInvoice1;

	@FindBy(xpath = "//div[@comp-id='79']")
	public WebElement amountExpctdInvoice2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[4]")
	public WebElement subTotaExpctdInvoice;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement discountExpctdInvoice;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[6]")
	public WebElement taxExpctdInvoice1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[7]")
	public WebElement taxExpctdInvoice2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[8]")
	public WebElement grandExpctdInvoice;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButtoninvoice;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButtonInvoice;

///////////// elements for actual////////////

////// 1st product//////
	@FindBy(xpath = "(//tbody)[1]//tr//td[1]")
	public WebElement placeofSuppInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[2]")
	public WebElement custmePOInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[3]")
	public WebElement refInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[4]")
	public WebElement paymntInvActual;
///////////////////

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement prdctInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[3]")
	public WebElement quantInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement uomInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement rateInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[6]")
	public WebElement HsnInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[9]")
	public WebElement amountInvActual1;

//////2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement prdctInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[3]")
	public WebElement qntInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement uomInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement rateInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[6]")
	public WebElement HsnInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[9]")
	public WebElement amountInvActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[1]")
	public WebElement subtotalInvActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[2]")
	public WebElement discountInvActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[3]")
	public WebElement taxInvActual1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[4]")
	public WebElement taxInvActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[5]")
	public WebElement grandInvtotalActual;

/////////////////////Credit Memo ////////////////////////////////////////

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement saveButtonMemo;
	
	
	

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButtonMemo;

	/// product 1//////
	@FindBy(xpath = "//div[@comp-id='23']")
	public WebElement productDropdownMemo;

	@FindBy(xpath = "//ul//li[contains(text(),'waxxe')]")
	public WebElement productSelectMemo;

	@FindBy(xpath = "//div[@comp-id='25']")
	public WebElement quantityMemo;

	@FindBy(xpath = "//div[@comp-id='26']")
	public WebElement UomMemo;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectMemo;

	@FindBy(xpath = "//div[@comp-id='38']")
	public WebElement HsnMemo;

	@FindBy(xpath = "//div[@comp-id='27']")
	public WebElement rateMemo;

	@FindBy(xpath = "//div[@comp-id='39']")
	public WebElement specialDiscountMemo;

	@FindBy(xpath = "//div[@comp-id='40']")
	public WebElement discountMemo;

	@FindBy(xpath = "//div[@comp-id='41']")
	public WebElement taxMemo;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"6\"]")
	public WebElement taxSelectMemo;

	//// product 2///////

	@FindBy(xpath = "//div[@comp-id='43']")
	public WebElement productDropdownMemo1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelectMemo1;

	@FindBy(xpath = "//div[@comp-id='45']")
	public WebElement quantityMemo1;

	@FindBy(xpath = "//div[@comp-id='46']")
	public WebElement UomMemo1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectMemo1;

	@FindBy(xpath = "//div[@comp-id='48']")
	public WebElement HsnMemo1;

	@FindBy(xpath = "//div[@comp-id='47']")
	public WebElement rateMemo1;

	@FindBy(xpath = "//div[@comp-id='49']")
	public WebElement specialDiscountMemo1;

	@FindBy(xpath = "//div[@comp-id='50']")
	public WebElement discountMemo1;

	@FindBy(xpath = "//div[@comp-id='51']")
	public WebElement taxMemo1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelectMemo1;

	@FindBy(xpath = "(//textarea[@class='description-textarea'])[1]")
	public WebElement remarksMemo;

	@FindBy(xpath = "//div[@comp-id='28']")
	public WebElement amount1ExpctdMemo;

	@FindBy(xpath = "//div[@comp-id='52']")
	public WebElement amount2ExpctdMemo;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement subTotalExpctdMemo;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement discountExpctdMemo;

//	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
//	public WebElement subTotalExpctdMemo;
//	
//	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
//	public WebElement subTotalExpctdMemo;
	
	
	@FindBy(xpath = "(//div[@class='modal-table-container'])/table/thead")
	public WebElement header;
	
	@FindBy(xpath = "(//tbody//tr)[1]")
	public WebElement productList1;

	@FindBy(xpath = "(//tbody//tr)[2]")
	public WebElement productList2;
	
	

	
//	

/////////////////////Sales Quote Create ////////////////////////////////////////

	public SalesDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void salesQuoteCreate() throws Exception {

		Utility.click(addButton);
		Thread.sleep(1000);
		Utility.click(salesQuoteLink);
		Thread.sleep(1000);
		Utility.click(selectCustomerDropdown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 2, "CustomerDetails") + "']")).click();
		Utility.wait_N_click(customerRFQ);
		Thread.sleep(1000);
		Utility.enterText(customerRFQ1, Utility.excelRead(7, 1, "CustomerDetails"));
		Thread.sleep(1000);
		Utility.wait_N_click(refNumber);
		Thread.sleep(1000);
		Utility.enterText(refNumber1, Utility.excelReadInt(7, 2, "CustomerDetails"));
		Utility.wait_N_click(priorityDropdown);
		Utility.click(priorityDropdown);
		Thread.sleep(1000);
		Utility.click(prioritySelect);
		Thread.sleep(1000);
		Utility.wait_N_click(productDropdown);
		Utility.click(productDropdown);
		Thread.sleep(1000);
		Utility.click(productSelect);
		Thread.sleep(1000);
		Utility.implicitwait();
		quantity.sendKeys(Quantity);
		Thread.sleep(1000);
		Utility.wait_N_click(Uom);
		Utility.click(Uom);
		Thread.sleep(1000);
		Utility.click(UomSelect);
		Thread.sleep(1000);
		Hsn.sendKeys(HSN);
		Utility.implicitwait();
		rate.sendKeys(Rate);
		Thread.sleep(1000);
		specialDiscount.sendKeys(SpclDiscnt);
		Utility.wait_N_click(tax);
		Utility.click(tax);
		Thread.sleep(1000);
		Utility.wait_N_click(taxSelect);
		Utility.wait_N_click(discount);
		discount.sendKeys(discnt);
		Utility.wait_N_click(addLine);
		Utility.wait_N_click(productDropdown1);
		Utility.click(productDropdown1);
		Thread.sleep(1000);
		Utility.click(productSelect1);
		Thread.sleep(1000);
		Utility.implicitwait();
		quantity1.sendKeys(Quantity1);
		Utility.wait_N_click(Uom1);
		Utility.click(Uom1);
		Thread.sleep(1000);
		Utility.click(UomSelect1);
		Utility.implicitwait();
		rate1.sendKeys(Rate1);
		Thread.sleep(1000);
		specialDiscount1.sendKeys(SpclDiscnt1);
		Utility.wait_N_click(tax1);
		Utility.click(tax1);
		Thread.sleep(1000);
		Utility.wait_N_click(taxSelect1);

		Utility.wait_N_click(discount1);
		discount1.sendKeys(discnt1);
		Thread.sleep(1000);
		Utility.JS_Scrolldown(saveButton);
		Utility.wait_N_click(uploadCustRFQ);

		File file5 = new File(prop.getProperty("CustomerRFQ"));
		StringSelection strSelection5 = new StringSelection(file5.getAbsolutePath());
		Clipboard clipboard5 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard5.setContents(strSelection5, null);
		Robot robot5 = new Robot();
		Thread.sleep(3000);
		robot5.keyPress(KeyEvent.VK_ENTER);
		robot5.keyRelease(KeyEvent.VK_ENTER);
		robot5.keyPress(KeyEvent.VK_CONTROL);
		robot5.keyPress(KeyEvent.VK_V);
		robot5.keyRelease(KeyEvent.VK_CONTROL);
		robot5.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot5.keyPress(KeyEvent.VK_ENTER);
		robot5.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		internalRemarks.sendKeys(remarks);
//	   
		System.out.println("expected:");
		System.out.println("RFQ: " + rfqNum);
		System.out.println("RFE: " + refNum);
		System.out.println("DESCRIPTION: " + descp);

		System.out.println("1st product: ");
		System.out.println("QUANTITY: " + quantity.getText().split("\\.")[0]);
		System.out.println("PRODUCT: " + productDropdown.getText());
		System.out.println("UOM: " + Uom.getText());
		System.out.println("RATE: " + rate.getText());
		System.out.println("HSN: " + Hsn.getText());
		System.out.println("Amount: " + amountExpctd1.getText().replaceAll("[^0-9.]", ""));
		System.out.println();

		System.out.println("2nd product: ");
		System.out.println("QUANTITY: " + quantity1.getText().split("\\.")[0]);
		System.out.println("PRODUCT: " + productDropdown1.getText());
		System.out.println("UOM: " + Uom1.getText());
		System.out.println("RATE: " + rate1.getText());
		// System.out.println("HSN: " +Hsn.getText());
		System.out.println("Amount: " + amountExpctd2.getText().replaceAll("[^0-9.]", ""));

		System.out.println("subtotal: " + subTotalExpctd.getText().replaceAll("[^0-9.]", ""));
		System.out.println("discount: " + discountExpctd.getText().replaceAll("[^0-9.]", ""));
		System.out.println("tax1: " + taxExpctd1.getText().replaceAll("[^0-9.]", ""));
		System.out.println("tax2: " + taxExpctd2.getText().replaceAll("[^0-9.]", ""));
		Thread.sleep(3000);

		////////////////////////////////////////////////////////////////////////
		System.out.println();

		java.util.List<String> expectedResult = new ArrayList<String>();

		expectedResult.add(rfqNum);
		expectedResult.add(refNum);
		expectedResult.add(priorityDropdown.getText());
		//// 1st product///
		expectedResult.add(productDropdown.getText());
		expectedResult.add(quantity.getText().split("\\.")[0]);
		expectedResult.add(Uom.getText());
		expectedResult.add(rate.getText().split("\\.")[0]);
		expectedResult.add(Hsn.getText());
		expectedResult.add(amountExpctd1.getText().replaceAll("[^0-9.]", ""));

		///// 2nd product////////
		expectedResult.add(productDropdown1.getText());
		expectedResult.add(quantity1.getText().split("\\.")[0]);
		expectedResult.add(Uom1.getText());
		expectedResult.add(rate1.getText().split("\\.")[0]);
		// expectedResult.add(Hsn.getText());
		expectedResult.add(amountExpctd2.getText().replaceAll("[^0-9.]", ""));
		//// common in all/////
		expectedResult.add(subTotalExpctd.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(discountExpctd.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(taxExpctd1.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(taxExpctd2.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(totalAmountExpctd.getText().replaceAll("[^0-9.]", ""));

		///////////////////////////////////////////////////////////////////////////////////////

		Utility.click(saveButton);
		Thread.sleep(3000);
		Utility.click(submitButton);
		Thread.sleep(2000);

		System.out.println();
		System.out.println("Actual: ");
		System.out.println("RFQActual: " + rfqNumActual.getText());
		System.out.println("RFEActual: " + refNumActual.getText());
		System.out.println("PRODUCTActual: " + productActual1.getText());

		System.out.println("first product: ");
		System.out.println("QUANTITYActual: " + quantityActual1.getText());
		System.out.println("PRODUCTActual: " + productActual1.getText());
		System.out.println("UOMActual: " + uomActual1.getText());
		System.out.println("RATEActual: " + rateActual1.getText());
		System.out.println("HSN: " + HsnActual1.getText());
		System.out.println("Amount: " + totalamountActual1.getText());

		System.out.println();

		System.out.println("2nd product: ");
		System.out.println("QUANTITY: " + quantityActual2.getText().split("\\.")[0]);
		System.out.println("PRODUCT: " + productActual2.getText());
		System.out.println("UOM: " + uomActual2.getText());
		System.out.println("RATE: " + rateActual2.getText());
		// System.out.println("HSN: " +Hsn.getText());
		System.out.println("Amount: " + totalamountActual2.getText().replaceAll("[^0-9.]", ""));

		System.out.println("subtotalActual: " + subtotalActual.getText());
		System.out.println("discountActual: " + discountActual.getText());
		System.out.println("tax1Actual: " + taxActual1.getText());
		System.out.println("tax2Actual: " + taxActual2.getText());
		System.out.println("total Amount Actual: " + grandtotalActual.getText());

		java.util.List<String> actualResult = new ArrayList<String>();

		actualResult.add(rfqNumActual.getText());
		actualResult.add(refNumActual.getText());
		actualResult.add(priorityActual.getText());
		///// 1st product///////
		actualResult.add(productActual1.getText());
		actualResult.add(quantityActual1.getText());
		actualResult.add(uomActual1.getText());
		actualResult.add(rateActual1.getText());
		actualResult.add(HsnActual1.getText());
		actualResult.add(totalamountActual1.getText());

		/////// 2nd product////////
		actualResult.add(productActual2.getText());
		actualResult.add(quantityActual2.getText());
		actualResult.add(uomActual2.getText());
		actualResult.add(rateActual2.getText());
		// actualResult.add(HsnActual2.getText());
		actualResult.add(totalamountActual2.getText());

		////// common in all///////
		actualResult.add(subtotalActual.getText());
		actualResult.add(discountActual.getText());
		actualResult.add(taxActual1.getText());
		actualResult.add(taxActual2.getText());
		actualResult.add(grandtotalActual.getText());

		System.out.println();

		for (int i = 0; i < expectedResult.size(); i++) {
			if (actualResult.get(i).contains(expectedResult.get(i))) {
				System.out.println("text matching: " + expectedResult.get(i));

			} else {
				System.out.println("text is not matching: " + expectedResult.get(i));
				et.log(LogStatus.FAIL,
						"Same amount/element is not reflecting after saving the details and Element is: "
								+ expectedResult.get(i),
						et.addScreenCapture(fail("Same amount/element is not reflecting after saving the details")));
			}
		}

		et.log(LogStatus.PASS, "Same amount/element is reflecting after saving the details",
				et.addScreenCapture(pass("Same amount/element is reflecting after saving the details")));

	}

/////////////////////Sales Invoice Create ////////////////////////////////////////

	public void salesInvoiceCreate() throws Exception {

		Utility.click(addButton);
		Thread.sleep(1000);
		Utility.click(salesInvoiceLink);
		Utility.implicitwait();
		Utility.click(selectCustomerDropdown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 2, "CustomerDetails") + "']")).click();
		Utility.click(customerPOInvoice);
		customerPOInvoice1.sendKeys(customerPO);
		Utility.wait_N_click(refNumberInvoice);
		Thread.sleep(1000);
		Utility.enterText(refNumberInvoice1, Utility.excelReadInt(7, 2, "CustomerDetails"));
		Utility.wait_N_click(productDropdownInvoice);
		Utility.click(productDropdownInvoice);
		Thread.sleep(1000);
		Utility.click(productSelectInvoice);
		Thread.sleep(1000);
		Utility.implicitwait();
		quantityInvoice.sendKeys(Quantity);
		Thread.sleep(1000);
		Utility.wait_N_click(UomInvoice);
		Utility.click(UomInvoice);
		Thread.sleep(1000);
		Utility.click(UomSelectInvoice);
		Thread.sleep(1000);
		HsnInvoice.sendKeys(HSN);
		Utility.implicitwait();
		rateInvoice.sendKeys(Rate);
		Thread.sleep(1000);
		specialDiscountInvoice.sendKeys(SpclDiscnt);
		Utility.wait_N_click(taxInvoice);
		Utility.click(taxInvoice);
		Thread.sleep(1000);
		Utility.wait_N_click(taxSelectInvoice);
		Utility.wait_N_click(discountInvoice);
		discountInvoice.sendKeys(discnt);
		Utility.JS_Scrolldown(saveButton);
		Utility.wait_N_click(addLineInvoice);
		Thread.sleep(1000);
		Utility.click(productDropdownInvoice1);
		Utility.click(productDropdownInvoice1);
		Thread.sleep(1000);
		Utility.click(productSelectInvoice1);
		Thread.sleep(1000);
		quantityInvoice1.sendKeys(Quantity1);
		Thread.sleep(1000);
		Utility.wait_N_click(UomInvoice1);
		Utility.click(UomInvoice1);
		Thread.sleep(1000);
		Utility.click(UomSelectInvoice1);
		Thread.sleep(1000);
		HsnInvoice1.sendKeys(HSN1);
		Utility.implicitwait();
		rateInvoice1.sendKeys(Rate1);
		Thread.sleep(1000);
		specialDiscountInvoice1.sendKeys(SpclDiscnt1);
		Thread.sleep(1000);
		discountInvoice1.sendKeys(discnt1);
		Thread.sleep(1000);
		Utility.implicitwait();
		Utility.wait_N_click(taxInvoice1);
		Utility.click(taxInvoice1);
		Utility.wait_N_click(taxSelectInvoice1);
		Utility.click(discountCheckBox);
		Utility.click(expenseCheckBox);
		Utility.implicitwait();
		discountEntry.sendKeys(discnt);
		Utility.wait_N_click(expenseDropdown);
		Utility.click(expenseDropdown);
		Utility.click(expenseSelect);
		expenseEntry.sendKeys(expense);
		remarksInvoice.sendKeys(remarks);
		Thread.sleep(2000);

//		 HashMap<String, String> hm = new HashMap<String, String>();
//
//		  // Adding pairs to HashMap
//		  hm.put("Customer PO", customerPOInvoice.getText());
//		  hm.put("Reference NO.", refNumberInvoice.getText());
//		 
//		
//		  System.out.println(hm);
//		

		java.util.List<String> expectedResult1 = new ArrayList<String>();
		expectedResult1.add(placeOFSupplyInvoice.getText());
		expectedResult1.add(customerPO);
		expectedResult1.add(refNum);
		expectedResult1.add(paymentTerms.getText());

		//// 1st product///
		expectedResult1.add(productDropdownInvoice.getText());
		expectedResult1.add(quantityInvoice.getText().split("\\.")[0]);
		expectedResult1.add(UomInvoice.getText());
		expectedResult1.add(rateInvoice.getText().split("\\.")[0]);
		expectedResult1.add(HsnInvoice.getText());
		expectedResult1.add(amountExpctdInvoice1.getText().replaceAll("[^0-9.]", ""));

		///// 2nd product////////
		expectedResult1.add(productDropdownInvoice1.getText());
		expectedResult1.add(quantityInvoice1.getText().split("\\.")[0]);
		expectedResult1.add(UomInvoice1.getText());
		expectedResult1.add(rateInvoice1.getText().split("\\.")[0]);
		expectedResult1.add(paymentTerms.getText());
		expectedResult1.add(HsnInvoice1.getText());
		expectedResult1.add(amountExpctdInvoice2.getText().replaceAll("[^0-9.]", ""));
		//// common in all/////
		expectedResult1.add(subTotaExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
		expectedResult1.add(discountExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
		expectedResult1.add(taxExpctdInvoice1.getText().replaceAll("[^0-9.]", ""));
		expectedResult1.add(taxExpctdInvoice2.getText().replaceAll("[^0-9.]", ""));
		expectedResult1.add(grandExpctdInvoice.getText().replaceAll("[^0-9.]", ""));

		System.out.println();
		System.out.println(customerPO);
		System.out.println(refNum);
		System.out.println(paymentTerms.getText());

		//// 1st product///
		System.out.println(productDropdownInvoice.getText());
		System.out.println(quantityInvoice.getText().split("\\.")[0]);
		System.out.println(UomInvoice.getText());
		System.out.println(rateInvoice.getText().split("\\.")[0]);
		System.out.println(HsnInvoice.getText());
		System.out.println(amountExpctdInvoice1.getText().replaceAll("[^0-9.]", ""));

		///// 2nd product////////
		System.out.println(productDropdownInvoice1.getText());
		System.out.println(quantityInvoice1.getText().split("\\.")[0]);
		System.out.println(UomInvoice1.getText());
		System.out.println(rateInvoice1.getText().split("\\.")[0]);
		System.out.println(HsnInvoice1.getText());
		System.out.println(amountExpctdInvoice2.getText().replaceAll("[^0-9.]", ""));
		//// common in all/////
		System.out.println(subTotaExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
		System.out.println(discountExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
		System.out.println(taxExpctdInvoice1.getText().replaceAll("[^0-9.]", ""));
		System.out.println(taxExpctdInvoice2.getText().replaceAll("[^0-9.]", ""));
		System.out.println(grandExpctdInvoice.getText().replaceAll("[^0-9.]", ""));

		Utility.click(saveButtoninvoice);
		Thread.sleep(2000);
		Utility.click(submitButtonInvoice);
		Utility.implicitwait();

		java.util.List<String> actualResult1 = new ArrayList<String>();
		actualResult1.add(placeofSuppInvActual.getText());
		actualResult1.add(custmePOInvActual.getText());
		actualResult1.add(refInvActual.getText());
		actualResult1.add(paymntInvActual.getText());

		//// 1st product///
		actualResult1.add(prdctInvActual1.getText());
		actualResult1.add(quantInvActual1.getText().split("\\.")[0]);
		actualResult1.add(uomInvActual1.getText());
		actualResult1.add(rateInvActual1.getText().split("\\.")[0]);
		actualResult1.add(HsnInvActual1.getText());
		actualResult1.add(amountInvActual1.getText().replaceAll("[^0-9.]", ""));

		///// 2nd product////////
		actualResult1.add(prdctInvActual2.getText());
		actualResult1.add(qntInvActual2.getText().split("\\.")[0]);
		actualResult1.add(uomInvActual2.getText());
		actualResult1.add(rateInvActual2.getText().split("\\.")[0]);
		actualResult1.add(HsnInvActual2.getText());
		actualResult1.add(amountInvActual2.getText().replaceAll("[^0-9.]", ""));
		//// common in all/////
		actualResult1.add(subtotalInvActual.getText().replaceAll("[^0-9.]", ""));
		actualResult1.add(discountInvActual.getText().replaceAll("[^0-9.]", ""));
		actualResult1.add(taxInvActual1.getText().replaceAll("[^0-9.]", ""));
		actualResult1.add(taxInvActual2.getText().replaceAll("[^0-9.]", ""));
		actualResult1.add(grandInvtotalActual.getText().replaceAll("[^0-9.]", ""));

		Utility.implicitwait();
		System.out.println();

		System.out.println(placeofSuppInvActual.getText());
		System.out.println(custmePOInvActual.getText());
		System.out.println(refInvActual.getText());
		System.out.println(paymntInvActual.getText());

		//// 1st product///
		System.out.println(prdctInvActual1.getText());
		System.out.println(quantInvActual1.getText().split("\\.")[0]);
		System.out.println(uomInvActual1.getText());
		System.out.println(rateInvActual1.getText().split("\\.")[0]);
		System.out.println(HsnInvActual1.getText());
		System.out.println(amountInvActual1.getText().replaceAll("[^0-9.]", ""));

		///// 2nd product////////
		System.out.println(prdctInvActual2.getText());
		System.out.println(qntInvActual2.getText().split("\\.")[0]);
		System.out.println(uomInvActual2.getText());
		System.out.println(rateInvActual2.getText().split("\\.")[0]);
		System.out.println(HsnInvActual2.getText());
		System.out.println(amountInvActual2.getText().replaceAll("[^0-9.]", ""));
		//// common in all/////
		System.out.println(subtotalInvActual.getText().replaceAll("[^0-9.]", ""));
		System.out.println(discountInvActual.getText().replaceAll("[^0-9.]", ""));
		System.out.println(taxInvActual1.getText().replaceAll("[^0-9.]", ""));
		System.out.println(taxInvActual2.getText().replaceAll("[^0-9.]", ""));
		System.out.println(grandInvtotalActual.getText().replaceAll("[^0-9.]", ""));

		System.out.println();

		for (int i = 0; i < expectedResult1.size(); i++) {
			if (actualResult1.get(i).contains(expectedResult1.get(i))) {
				System.out.println("text matching: " + expectedResult1.get(i));

			} else {
				System.out.println("text is not matching: " + expectedResult1.get(i));
				et.log(LogStatus.FAIL,
						"Same amount/element is not reflecting after saving the details and Element is: "
								+ expectedResult1.get(i),
						et.addScreenCapture(fail("Same amount/element is not reflecting after saving the details")));
			}
		}

		et.log(LogStatus.PASS, "Same amount/element is reflecting after saving the details",
				et.addScreenCapture(pass("Same amount/element is reflecting after saving the details")));

	}

/////////////////////Credit Memo Create ////////////////////////////////////////

	public void creditMemoCreate() throws Exception {

		Utility.click(addButton);
		Thread.sleep(1000);
		Utility.click(creditMemoLink);
		Thread.sleep(1000);
		Utility.click(selectCustomerDropdown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 2, "CustomerDetails") + "']")).click();
		Utility.click(productDropdownMemo);
		Utility.click(productDropdownMemo);
		Utility.click(productSelectMemo);
		Utility.implicitwait();
		quantityMemo.sendKeys(Quantity);
		Utility.wait_N_click(UomMemo);
		Utility.click(UomMemo);
		Utility.click(UomSelectMemo);

		Utility.implicitwait();
		rateMemo.sendKeys(Rate);
		Utility.implicitwait();
		HsnMemo.sendKeys(HSN);
		specialDiscountMemo.sendKeys(SpclDiscnt);
		Utility.wait_N_click(taxMemo);
		Utility.click(taxMemo);
		Utility.wait_N_click(taxSelectMemo);
		Utility.wait_N_click(discountMemo);
		discountMemo.sendKeys(discnt);

		
		Utility.JS_Scrolldown(saveButtonMemo);
		Utility.click(addLine);

		Utility.click(productDropdownMemo1);
		Utility.click(productDropdownMemo1);
		Utility.click(productSelectMemo1);
		Utility.implicitwait();
		quantityMemo1.sendKeys(Quantity1);
		Utility.wait_N_click(UomMemo1);
		Utility.click(UomMemo1);
		Utility.wait_N_click(UomSelectMemo1);

		Utility.implicitwait();
		rateMemo1.sendKeys(Rate1);
		Utility.implicitwait();
		HsnMemo1.sendKeys(HSN1);
		specialDiscountMemo1.sendKeys(SpclDiscnt1);
		Utility.wait_N_click(taxMemo1);
		Utility.click(taxMemo1);
		Utility.wait_N_click(taxSelectMemo1);
		Utility.wait_N_click(discountMemo1);
		discountMemo1.sendKeys(discnt1);
		
		
		Utility.JS_Scrolldown(saveButtonMemo);

		java.util.List<String> expectedResult2 = new ArrayList<String>();
//
//		//// 1st product///
//		expectedResult2.add(productDropdownMemo.getText());
//		expectedResult2.add(quantityMemo.getText().split("\\.")[0]);
//		expectedResult2.add(UomInvoice.getText());
//		expectedResult2.add(rateMemo.getText().split("\\.")[0]);
//		expectedResult2.add(HsnMemo.getText());
//		expectedResult2.add(amount1ExpctdMemo.getText().replaceAll("[^0-9.]", ""));
//
//		///// 2nd product////////
//		expectedResult2.add(productDropdownMemo1.getText());
//		expectedResult2.add(quantityMemo1.getText().split("\\.")[0]);
//		expectedResult2.add(UomMemo1.getText());
//		expectedResult2.add(rateMemo1.getText().split("\\.")[0]);
//		expectedResult2.add(HsnMemo1.getText());
//		expectedResult2.add(amount2ExpctdMemo.getText().replaceAll("[^0-9.]", ""));
//		//// common in all/////
//		expectedResult2.add(subTotaExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
//		expectedResult2.add(discountExpctdInvoice.getText().replaceAll("[^0-9.]", ""));
//		expectedResult2.add(taxExpctdInvoice1.getText().replaceAll("[^0-9.]", ""));
//		expectedResult2.add(taxExpctdInvoice2.getText().replaceAll("[^0-9.]", ""));
//		expectedResult2.add(grandExpctdInvoice.getText().replaceAll("[^0-9.]", ""));

		
		Utility.wait_N_click(saveButtonMemo);
		Utility.implicitwait();
		Utility.click(submitButtonMemo);
		Utility.implicitwait();
		 System.out.println(header.getText());
		 System.out.println(productList1.getText());
		 
		 
		 HashMap<String,Object> custDetails = new HashMap<String,Object>();
	  
		 String strCol = header.getText();
	    
	     strCol = strCol.replace("Net Amount", "Net-Amount");
	     String strVal = productList1.getText();
	     String strVal1 = productList2.getText();
	     
		 String[] studentInformationArray = new String[]{ productList1.getText()};
	     
	     String[] arrOfCol = strCol.split(" ", 7);
	     String[] arrOfVal = strVal.split(" ", 7); 
	     String[] arrOfVal1 = strVal1.split(" ", 7); 
	   
	     for (int i = 0; i < arrOfCol.length; i++) {
	       custDetails.put(arrOfCol[i], arrOfVal[i]);
	       custDetails.put(arrOfCol[i], arrOfVal1[i]);
	     }

	      //System.out.println("Custom Details = " + custDetails);
	      custDetails.remove("#");
	      System.out.println("Custom Details = " + custDetails);
	    
		
		
		
		

	}

}

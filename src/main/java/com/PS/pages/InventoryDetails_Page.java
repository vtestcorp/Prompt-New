package com.PS.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.PS.base.Base;
public class InventoryDetails_Page extends Base {
	@FindBy(xpath = "//ul[@role='menu']//a[@href='/admin/customers']//parent::li//following-sibling::li[2]")
	public WebElement inventoryMenuBtn;
	
	@FindBy(xpath = "//ul[@role='menu']//a[@href='/admin/products']")
	public WebElement productsSubMenuBtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter 3 characters product name']")
	public WebElement textBoxSearch;
	
	@FindBy(xpath = "(//div[@class='ag-row-drag']//following::span[1])[1]")
	public WebElement labelFirstProductName;
	
	@FindBy(xpath = "//div[@class='ag-row-drag']//following::span[1]")
	public List<WebElement> labelProductNames;
	
	@FindBy(xpath = "//button[text()='New Product']")
	public WebElement buttonNewProduct;
	
	@FindBy(xpath = "//input[@placeholder='Please enter product name']")
	public WebElement textBoxProductName;
	
	@FindBy(xpath = "//textarea[@placeholder='Please enter product description']")
	public WebElement textBoxProductDescription;
	
	@FindBy(xpath = "//div[text()='Warehouse']")
	public WebElement buttonWareHouse;
	
	@FindBy(xpath = "//div[text()='Please Select Warehouse']//parent::div[@class='ant-select-selection__rendered']")
	public WebElement dropdownWareHouse;
	
	@FindBy(xpath = "//ul[contains(@class,'ant-select-dropdown-menu')]//li")
	public WebElement dropdownWareHouseOption;
	
	@FindBy(xpath = "//button//span[text()='Submit']")
	public WebElement buttonSubmit;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement buttonPopUpSubmit;
	
	@FindBy(xpath = "//span[text()='Variants']")
	public WebElement labelVariants;
	
	@FindBy(xpath = "//span[text()='Product Details']")
	public WebElement labelProductDetails;
	
	@FindBy(xpath = "//span[text()='Valuation']")
	public WebElement labelValuation;
	
	@FindBy(xpath = "//span[text()='SKU']")
	public WebElement labelSKU;
	
	@FindBy(xpath = "//span[text()='Category']")
	public WebElement labelCategory;
	
	@FindBy(xpath = "//span[text()='HSN Code']")
	public WebElement labelHSNCode;
	
	@FindBy(xpath = "//span[text()='Current Stock']")
	public WebElement labelCurrentStock;
	
	@FindBy(xpath = "//span[text()='Warehouse']")
	public WebElement labelWarehouse;
	
	public InventoryDetails_Page() {
		PageFactory.initElements(driver, this);
	}
}
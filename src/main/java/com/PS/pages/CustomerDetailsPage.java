package com.PS.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.PS.base.Base;
import com.PS.util.Utility;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerDetailsPage extends Base {

	boolean custext;
	@FindBy(xpath = "//li@name='Maharashtra']")
	public WebElement selectstate;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//h2[@class='text-center signup-wizard-hding ng-scope']")
	public WebElement CompanySetupWizardText;

	@FindBy(xpath = "//button[@class='btn-sm btn btn-default pull-left']")
	public WebElement SkipBtn;

	@FindBy(xpath = "//ul[@role='menu']//a[@href='/admin/customers']")
	public WebElement CustomersMenuBtn;

	@FindBy(xpath = "//button[contains(text(),'New Customer')]")
	public WebElement NewCustomer;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	public WebElement companyName;

	@FindBy(xpath = "//div[contains(text(),'Select Payment Term')]")
	public WebElement paymentTerm;

	@FindBy(xpath = "//li[@name='Cash on Delivery']")
	public WebElement paymentTermSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//unewnamel[@id='select2-results-70']")
	public WebElement paymentTermSearchClick;

	@FindBy(xpath = "//div[text()='Select Customer Type']")
	public WebElement customerType;

	@FindBy(xpath = "//input[@id='s2id_autogen72_search']")
	public WebElement customerTypeSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-72']")
	public WebElement customerTypeSearchClick;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//div[text()='Select Customer Source']")
	public WebElement customerSource;

	@FindBy(xpath = "//input[@id='s2id_autogen74_search']")
	public WebElement customerSourceSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-74']")
	public WebElement customerSourceSearchClick;

	@FindBy(xpath = "//div[text()='Select Company Rating']/parent::div")
	public WebElement rateYourCompany;

	@FindBy(xpath = "//input[@id='s2id_autogen76_search']")
	public WebElement rateYourCompanySearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-76']")
	public WebElement rateYourCompanySearchClick;

	@FindBy(xpath = "//div[text()='Select Industry']")
	public WebElement Industry;

	@FindBy(xpath = "//input[@id='s2id_autogen78_search']")
	public WebElement IndustrySearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-78']")
	public WebElement IndustrySearchClick;

	@FindBy(xpath = "//input[@placeholder='Relationship Since Date']")
	public WebElement relationship;

	@FindBy(xpath = "//a[text()='Today']/parent::span")
	public WebElement relationship_date;

	@FindBy(xpath = "//input[@placeholder='Street Name']")
	public WebElement streetName;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement city;

	@FindBy(xpath = "//div[text()='State']/parent::div")
	public WebElement state;

	@FindBy(xpath = "(//a[@class='select2-choice'])[4]")
	public WebElement stateName;

	@FindBy(xpath = "(//input[@class='select2-input'][@role='combobox'])[11]")
	public WebElement stateNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label']")
	public WebElement stateNameSearchClick;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode;

	@FindBy(xpath = "(//div[text()='Select Country'])[1]")
	public WebElement country;

	@FindBy(xpath = "//span[text()='Shipping address same as billing']/parent::label")
	public WebElement sameAsBillingAddress;

	@FindBy(xpath = "(//div[text()='Contact'])[2]")
	public WebElement contactsubmenu;

	@FindBy(xpath = "//input[@id='s2id_autogen84']/..//b")
	public WebElement title;

	@FindBy(xpath = "//input[@id='s2id_autogen84_search']")
	public WebElement titleSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-84']")
	public WebElement titleSearchClick;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement phonename;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement customerEmail;

	@FindBy(xpath = "//a[contains(text(),'Tax Information')]")
	public WebElement taxInfoSubmenu;

	@FindBy(xpath = "//input[@id='s2id_autogen86']/..//b")
	public WebElement GSTMech;

	@FindBy(xpath = "//input[@id='s2id_autogen86_search']")
	public WebElement GSTMechSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-86']")
	public WebElement GSTMechSearchClick;

	@FindBy(xpath = "//input[@name='gstNumber']")
	public WebElement GSTIN;

	@FindBy(xpath = "//input[@name='panNumber']")
	public WebElement PAN;

	@FindBy(xpath = "//a[contains(text(),'Logo')]")
	public WebElement LogoSubmenu;

	@FindBy(xpath = "//input[@id='customerLogo']/..//span[contains(text(),'Select file')]/../..//div")
	public WebElement selectLogo;

	@FindBy(xpath = "//button[contains(text(),'Capture')]")
	public static WebElement Capture;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement save;

	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement save1;

	@FindBy(xpath = "//div[@class='modal-body ng-scope']")
	public WebElement popupText;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public WebElement ConfirmationYES;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalCustomerCount;

	@FindBy(xpath = "//li[text()='Import Customer']")
	public WebElement newCustomerDropdown;

	@FindBy(xpath = "//div[@id='page-container']//ul[@class='dropdown-menu']//a[1]")
	public WebElement importCustomer;

	@FindBy(xpath = "//span[text()='Next']/parent::button")
	public WebElement Nextbtn;

	@FindBy(xpath = "//span[text()='Done']/parent::button")
	public WebElement Nextbtn2;

	@FindBy(xpath = "(//input[@value='Next'])[3]")
	public WebElement Nextbtn3;

	@FindBy(xpath = "//button[contains(@class,'btn btn-green center-block')]//i")
	public WebElement downloadTemplate;

	@FindBy(xpath = "//div[@class='ant-upload ant-upload-drag']")
	public WebElement chooseFile;

	@FindBy(xpath = "//span[contains(text(),'ImportCustomers.xls')]")
	public WebElement FileName;

	@FindBy(xpath = "//div[contains(@class,'pull-right')]//input[contains(@class,'finish btn-green btn')]")
	public WebElement uploadCustomers;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement searchbox;

	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a//strong)[1]")
	public WebElement searchedCust;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement hamburgerbtn;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[7]")
	public WebElement editCustomer;

	@FindBy(xpath = "//h3[@class='modal-title text-center ng-binding']")
	public WebElement CustomerTextVerify;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[2]")
	public static WebElement createSOInvoice;

	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public static WebElement CustomerSelection;

	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public WebElement ProjectName;

	@FindBy(xpath = "//input[@id='s2id_autogen87_search']")
	public static WebElement ProjectNameSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-87']")
	public static WebElement ProjectNameSearchClick;

	@FindBy(xpath = "//label[contains(text(),'Select Place of Supply')]")
	public static WebElement PlaceOfSupply;

	@FindBy(xpath = "//span[contains(text(),'Select Place of Supply')]/..//b")
	public WebElement PlaceOFSupplyClick;

	@FindBy(xpath = "//input[@id='s2id_autogen77_search']")
	public static WebElement PlaceOFSupplyClickSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-77']")
	public static WebElement PlaceOFSupplyClickClick;

	@FindBy(xpath = "(//input[@name='referenceNumber'])[1]")
	public static WebElement CustomerPO;

	@FindBy(xpath = "(//input[@name='referenceNumber'])[2]")
	public static WebElement ref;

	@FindBy(xpath = "//input[@id='s2id_autogen79']/..//b")
	public WebElement BillingAddress;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-79']")
	public WebElement BillingAddressAddNew;

	@FindBy(xpath = "//span[contains(text(),'×')]")
	public WebElement cancelIcon;

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	public WebElement close;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[9]/..//b")
	public WebElement payTerms;

	@FindBy(xpath = "//input[@id='s2id_autogen83_search']")
	public static WebElement payTermsSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-83']")
	public static WebElement payTermsSearchClick;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-pencil']/..")
	public WebElement pencilEditIcon;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[10]/..//b")
	public WebElement productName;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[15]")
	public static WebElement productNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement productNameSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement quantity;

	@FindBy(xpath = "//input[@id='rate0'][@type='number']")
	public static WebElement rate;

	@FindBy(xpath = "//button[@class='btn btn-green pull-left']")
	public static WebElement InvoiceSave;

	@FindBy(xpath = "//p[@class='ng-binding']")
	public static WebElement ConfirmatioBox;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement YES;

	@FindBy(xpath = "//div[@class='modal-header ng-scope']//h3[@id='reportTitle']")
	public static WebElement ValidateSInvoice;

	@FindBy(xpath = "//div[@class='modal-header ng-scope']//button[@type='button']")
	public static WebElement InvoiceClose;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[1]")
	public static WebElement getInvoiceNumber;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[4]")
	public static WebElement getInvoiceAmount;

	@FindBy(xpath = "(//h4[@class='panel-title']//a[@accordion-transclude='heading'])//i[@class='pull-right fa fa-angle-left']")
	public static WebElement FilterToggle;

	@FindBy(xpath = "//input[@class='select2-input select2-default'][@type='text']")
	public static WebElement CustomerClick;

	@FindBy(xpath = "//ul[@class='select2-results']//li[1]")
	public static WebElement CustomerBox;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement applyFilter;

	@FindBy(xpath = "//div[@id='page-container']//td[3]//a")
	public static WebElement getCustomerName;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[3]")
	public static WebElement createCreditMemo;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[5]/..//b")
	public WebElement MemoProductName;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[11]")
	public static WebElement MemoProductNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement MemoProductNameSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement MemoQuantity;

	@FindBy(xpath = "//input[@id='0-4'][@type='number']")
	public static WebElement MemoRate;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement MemoInvoiceSave;

	@FindBy(xpath = "//p[@class='ng-binding']")
	public static WebElement MemoConfirmatioBox;

	@FindBy(xpath = "(//button[@class='btn btn-green'])[2]")
	public static WebElement MemoYES;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[5]")
	public WebElement acceptPayment;

	@FindBy(xpath = "//div[@class='modal-header ignorePDFElement']//h3[@id='reportTitle']")
	public WebElement paymentDetailPopupText;

	@FindBy(xpath = "//div[@class='col-sm-6 ng-binding']")
	public WebElement CustomerName;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[2]/..//b")
	public static WebElement clickInvoiceNumber;

	@FindBy(xpath = "(//input[@class='select2-input'][@type='text'])[3]")
	public static WebElement enterInvoiceNumberSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@class='select2-results']")
	public static WebElement clickInvoiceNumSearchSelect;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[3]/..//b")
	public static WebElement paymentMode;

	@FindBy(xpath = "(//input[@class='select2-input'][@type='text'])[3]")
	public static WebElement paymentModeSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@class='select2-results']")
	public static WebElement paymentModeSearchClick;

	@FindBy(xpath = "//input[@name='payment Mode Details']")
	public static WebElement paymentModeDetails;

	@FindBy(xpath = "//input[@name='amount']")
	public static WebElement amount;

	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-green']")
	public static WebElement addPayment;

	@FindBy(xpath = "//button[@type='button'][@class='btn btn-default']")
	public static WebElement cancel;

	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a)[1]")
	public static WebElement searchedCust1;

	@FindBy(xpath = "(//button[@class='btn btn-green-alt'][@title='Payment'])[1]")
	public static WebElement Payment;

	@FindBy(xpath = "//h4[contains(text(),'Transaction does not exist')]")
	public static WebElement PaymentTransactionNotExist;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[11]")
	public static WebElement ShowAddress;

	@FindBy(xpath = "//h3[@class='modal-title text-center']")
	public static WebElement showAddressPopUpText;

	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	public static WebElement AddRow;

	@FindBy(xpath = "//input[@id='2']")
	public static WebElement AddressName;

	@FindBy(xpath = "//tr[3]//td[5]//input[1]")
	public static WebElement StreetAddress1;

	@FindBy(xpath = "//tr[3]//td[6]//input[1]")
	public static WebElement StreetAddress2;

	@FindBy(xpath = "//tr[3]//td[7]//input[1]")
	public static WebElement AddressCity;

	@FindBy(xpath = "//select[@class='show-address-input ng-pristine ng-valid ng-empty ng-touched']")
	public static WebElement AddressCountry;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement AddressSave;
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement AddressConfirmationYes;

	@FindBy(xpath = "//tr[3]//td[11]//div[1]//button[1]")
	public static WebElement AddressEdit;

	@FindBy(xpath = "(//div[@class='icheckbox_flat'])[12]//input[@type='checkbox']")
	public WebElement DefaultAddressYES;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[4]")
	public static WebElement createExpense;

	@FindBy(xpath = "//div[@class='actionIcon ng-scope']//a[@class='ng-scope']")
	public static WebElement ExpPencilIcon;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[6]/..//b")
	public static WebElement ExpenseType;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[6]")
	public static WebElement expenseTypeSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement expenseTypeSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement expenseAmount;

	@FindBy(xpath = "//button[@class='btn btn-green ng-binding']")
	public static WebElement createExpenseBtn;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement expConfirmationBoxYES;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[1]")
	public static WebElement getExpenseNumber;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[2]")
	public static WebElement getExpCustomerName;

	@FindBy(xpath = "(//a[@class='company-name'])[1]")
	public WebElement labelFirstCustomerName;

	@FindBy(xpath = "//div[@aria-rowindex='2']//button[1]")
	public WebElement update_customer_menu_button_for_first_row;

	@FindBy(xpath = "//a[text()='Edit Customer']")
	public WebElement edit_cust_option;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement textBoxSearch;

	@FindBy(xpath = "//i[@class='anticon anticon-plus']")
	public WebElement buttonPlus;

	@FindBy(xpath = "//a[text()='Sales Invoice']")
	public WebElement linkSalesInvoice;

	@FindBy(xpath = "//*[text()='Standard Invoice']")
	public WebElement headerSalesInvoice;

	@FindBy(xpath = "(//div[@class='value'])[1]")
	public WebElement labelSelectedCustomerName;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-icon-only']//preceding-sibling::div[1]")
	public WebElement dropDownCustomer;

	@FindBy(xpath = "(//div[@ref='eCenterContainer'])[1]//child::div[2]")
	public WebElement textBoxRefNo;

	@FindBy(xpath = "//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']//li[1]")
	public WebElement optionFirst;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement loginemail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement loginpassword;

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement LoginBtn1;

	@FindBy(xpath = "//h4[contains(text(),'Log in to get started or')]")
	public WebElement lheader;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	public WebElement contact1;

	@FindBy(xpath = "//div[text()='Select Title']")
	public WebElement selectTitle1;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstName1;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	public WebElement MiddleName1;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName1;

	@FindBy(xpath = "//input[@placeholder='Call Name']")
	public WebElement CallName1;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement Phone1;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile1;

	@FindBy(xpath = "//input[@placeholder='Fax Number']")
	public WebElement FaxNumber1;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement Email1;

	@FindBy(xpath = "//div[@role=\"tab\" and text()=\"Tax Information\"]")
	public WebElement tax1;

	@FindBy(xpath = "//div[contains(text(),'Select GST Mechanism')]")
	public WebElement GstMech1;

	@FindBy(xpath = "//input[@placeholder='Enter GSTIN']")
	public WebElement GstNum1;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum1;

	@FindBy(xpath = "//span[@class='ant-form-item-children']//span[@class='ant-checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//div[@role='tab' and text()=\"Logo\"]	")
	public WebElement logo1;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public WebElement uploadButton1;

///////////////////////// Customer>Log Activity/////////////////////////

	@FindBy(xpath = "//ul[@role='menu']//a[@href='/admin/customers']")
	public WebElement customersmenubtn;

	@FindBy(xpath = "//button[@class='ant-btn action-btn small ant-dropdown-trigger']")
	public WebElement actionbutton;

	@FindBy(xpath = "//a[text()='Log Activity']")
	public WebElement logactivity;

	@FindBy(xpath = "//input[@placeholder='Activity name']")
	public WebElement activityname;

	@FindBy(xpath = "//input[@id='Log_activity_description']")
	public WebElement activitydescription;

	@FindBy(xpath = "//body/div/div[@class='ant-modal-root']/div[@class='ant-modal-wrap ant-modal-centered log-activity-modal']/div[@class='ant-modal']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/form[@class='ant-form ant-form-horizontal ant-form-hide-required-mark']/div[@class='modal-content']/div[4]/div[2]/div[1]/span[1]/div[1]/div[1]/span[1]/i[1]/*[1]")
	public WebElement activitytype;

	@FindBy(xpath = "//li//span[contains(text(),'Payment')]")
	public WebElement activitytype1;

	@FindBy(xpath = "//body/div/div[@class='ant-modal-root']/div[@class='ant-modal-wrap ant-modal-centered log-activity-modal']/div[@class='ant-modal']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/form[@class='ant-form ant-form-horizontal ant-form-hide-required-mark']/div[@class='modal-content']/div[6]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]")
	public WebElement status;

	@FindBy(xpath = "//li//span[contains(text(),'Completed')]")
	public WebElement statustype;

	@FindBy(xpath = "//body/div/div[@class='ant-modal-root']/div[@class='ant-modal-wrap ant-modal-centered log-activity-modal']/div[@class='ant-modal']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/form[@class='ant-form ant-form-horizontal ant-form-hide-required-mark']/div[@class='modal-content']/div[8]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]")
	public WebElement priority;

	@FindBy(xpath = "//li//span[contains(text(),'High')]")
	public WebElement prioritytype;

	@FindBy(xpath = "//body/div/div[@class='ant-modal-root']/div[@class='ant-modal-wrap ant-modal-centered log-activity-modal']/div[@class='ant-modal']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/form[@class='ant-form ant-form-horizontal ant-form-hide-required-mark']/div[@class='modal-content']/div[@class='ant-row ant-form-item']/div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-24 ant-col-sm-16']/div[@class='ant-form-item-control']/span[@class='ant-form-item-children']/span[@id='Log_activity_dueDate']/div/i[@class='anticon anticon-calendar ant-calendar-picker-icon']/*[1]")
	public WebElement calender;

	@FindBy(xpath = "//a[contains(@class,'ant-calendar-today-btn')]")
	public WebElement date;

	@FindBy(xpath = "//body/div/div[@class='ant-modal-root']/div[@class='ant-modal-wrap ant-modal-centered log-activity-modal']/div[@class='ant-modal']/div[@class='ant-modal-content']/div[@class='ant-modal-body']/form[@class='ant-form ant-form-horizontal ant-form-hide-required-mark']/div[@class='modal-content']/div[11]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]")
	public WebElement assignto;

	@FindBy(xpath = "//li//span[contains(text(),'sukanya')]")
	public WebElement assigntoname;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement creatactivity;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitbtn;

	@FindBy(xpath = "//div[@class=\"ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value\"]")
	public WebElement displaydate;

	@FindBy(xpath = "//a[@class=\"company-name\"]")
	public WebElement customer;

	@FindBy(xpath = "//div[contains(text(),'Activities')]")
	public WebElement customeractivity;

	@FindBy(xpath = "//div[@role='gridcell' and text()='Testing']")
	public WebElement tesingactivitycheck;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement searchcustomer;

/////////////////////////Customer>Log Communication/////////////////////////

	@FindBy(xpath = "//a[text()='Log Communication']")
	public WebElement logcommunication;

	@FindBy(xpath = "//input[@id='Log_activity_mode']")
	public WebElement communicationmode;

	@FindBy(xpath = "//input[@id='Log_activity_description']")
	public WebElement communicationdescription;

	@FindBy(xpath = "//input[@id='Log_activity_communicatedTo']")
	public WebElement communicateto;

	@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary')]")
	public WebElement savebtn;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitbutton;

	@FindBy(xpath = "//div[contains(text(),'Communications')]")
	public WebElement customercommunication;

	@FindBy(xpath = "//div[@role='gridcell' and text()='Email']")
	public WebElement emailcommunicationcheck;

	@FindBy(xpath = "//li[@name='sukanya']")
	public WebElement commuName;

	public CustomerDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String pass) {
		Assert.assertEquals(lheader.isDisplayed(), true, "No login screen found");
		email.sendKeys(username);
		password.sendKeys(pass);
		LoginBtn.click();

	}

//////////////////////////// Creating Customer//////////////////////////////////////////

	public void createCustomer() throws InterruptedException, IOException, AWTException {
		Utility.click(CustomersMenuBtn);
		Thread.sleep(1000);
		Utility.JS_Scrolldown(totalCustomerCount);
		Thread.sleep(1000);
		String totalCustCount = null;
		String number = totalCustomerCount.getText();
		if (totalCustomerCount.isDisplayed()) {
			totalCustCount = totalCustomerCount.getText();
		}
		Thread.sleep(1000);
		Utility.click(NewCustomer);
		Thread.sleep(2000);
		Utility.ExcelReadAndWrite(2, 2);
		Utility.implicitwait();
		Utility.enterText(companyName, Utility.excelRead(2, 2, "CustomerDetails"));
		Thread.sleep(2000);
		Utility.click(paymentTerm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 3, "CustomerDetails") + "']")).click();
		Utility.click(customerType);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 4, "CustomerDetails") + "']")).click();
		Utility.enterText(companyWebsite, Utility.excelRead(2, 5, "CustomerDetails"));
		Utility.click(customerSource);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 6, "CustomerDetails") + "']")).click();
		Utility.click(rateYourCompany);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelReadInt(2, 7, "CustomerDetails") + "']")).click();
		Utility.click(Industry);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 8, "CustomerDetails") + "']")).click();
		Utility.click(relationship);
		Thread.sleep(2000);
		Utility.click(relationship_date);
		Utility.enterText(streetName, Utility.excelRead(2, 9, "CustomerDetails"));
		Utility.enterText(city, Utility.excelRead(2, 10, "CustomerDetails"));
		Utility.enterText(zipcode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.JS_Scrolldown(save);
		Utility.click(country);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 32, "CustomerDetails") + "']")).click();
		Thread.sleep(2000);
		Utility.click(state);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='Goa']")).click();
		Thread.sleep(1000);
		Utility.click(sameAsBillingAddress);
		Utility.click(contact1);
		Thread.sleep(1000);
		Utility.click(selectTitle1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='Dr.']")).click();
		Thread.sleep(1000);
		Utility.enterText(FirstName1, Utility.excelRead(2, 36, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(MiddleName1, Utility.excelRead(2, 37, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(LastName1, Utility.excelRead(2, 38, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(CallName1, Utility.excelRead(2, 39, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Phone1, Utility.excelRead(2, 40, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Mobile1, Utility.excelRead(2, 41, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(FaxNumber1, Utility.excelRead(2, 42, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(Email1, Utility.excelRead(2, 43, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.click(tax1);
		Thread.sleep(1000);
		Utility.click(GstMech1);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 44, "SupplierDetails") + "']")).click();
		Thread.sleep(1000);
		Utility.enterText(GstNum1, Utility.excelRead(2, 45, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.enterText(PanNum1, Utility.excelRead(2, 46, "SupplierDetails"));
		Thread.sleep(1000);
		Utility.click(checkBox);
		Thread.sleep(1000);
		Utility.click(logo1);
		Utility.click(uploadButton1);
		File file2 = new File(prop.getProperty("Logo"));
		StringSelection strSelection2 = new StringSelection(file2.getAbsolutePath());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection2, null);
		Robot robot1 = new Robot();
		Thread.sleep(3000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Utility.click(save);
		Thread.sleep(3000);
		Utility.click(save1);
		Thread.sleep(3000);
		String totalCustCountCurrent = totalCustomerCount.getText();
		System.out.println("Actual" + totalCustCountCurrent);
		Thread.sleep(1000);
		try {
			Assert.assertNotEquals(totalCustCount, totalCustCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Cusomter Created and count got increased",
					et.addScreenCapture(pass("New Customer is Created and count got increased")));
		} catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Customer Count hasn't increased",
					et.addScreenCapture(fail("Customer Count hasn't increased")));
		}
	}

////////////////////////////Upload Customer//////////////////////////////////////////

	public void uploadCustomer() throws Exception {
		Utility.click(CustomersMenuBtn);
		Thread.sleep(1000);
		String totalCustCount = null;
		Utility.JS_Scrolldown(totalCustomerCount);
		Thread.sleep(1000);
		if (totalCustomerCount.isDisplayed()) {
			totalCustCount = totalCustomerCount.getText();
			System.out.println("Expected " + totalCustCount);
		} else {
			System.out.println("Not Displayed");
		}
		new Actions(driver).moveToElement(NewCustomer).perform();
		Utility.click(newCustomerDropdown);
		Thread.sleep(1000);
		Utility.click(Nextbtn);
		Utility.click(chooseFile);
		File f4 = new File(prop.getProperty("ImportCustomers1"));
		StringSelection strSelection1 = new StringSelection(f4.getAbsolutePath());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection1, null);
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
		Utility.click(Nextbtn2);
		Thread.sleep(1000);
		Utility.ActionClick(close);
		Thread.sleep(2000);
		String importCust = new String(Utility.excelReadHssf(1, 0, "ImportCustomers1"));
		System.out.println(importCust);
		Utility.enterText(searchbox, importCust);
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(1, 0, "ImportCustomers1") + "']"));
			custext = true;
		} catch (Exception e) {
			custext = false;
		}
		Thread.sleep(1000);
		try {
			Assert.assertEquals(custext, true, "Customer not created");
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created customer name found",
					et.addScreenCapture(fail("New created customer name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created customer name found",
					et.addScreenCapture(pass("New created customer name not found")));
			System.out.println("search mismatched ");
		}
		String totalCustCountCurrent = totalCustomerCount.getText();
		System.out.println("Actual" + totalCustCountCurrent);
		Thread.sleep(1000);
		try {
			Assert.assertNotEquals(totalCustCount, totalCustCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Cusomter Created and count got increased",
					et.addScreenCapture(pass("New Customer is Created and count got increased")));
		} catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Customer Count hasn't increased",
					et.addScreenCapture(fail("Customer Count hasn't increased")));
		}
	}

//////////////////////////// Update customer //////////////////////////////////////////

	public void updateCustomer() throws IOException, InterruptedException {
		Utility.click(CustomersMenuBtn);
		Thread.sleep(1000);
		Utility.implicitwait();
		Utility.click(update_customer_menu_button_for_first_row);
		Thread.sleep(2000);
		Utility.click(edit_cust_option);
		Thread.sleep(2000);
		String newname = Utility.updatecompname(companyName.getAttribute("value"));
		Utility.enterText(companyName, newname);
		Utility.JS_Scrolldown(save);
		Thread.sleep(2000);
		Utility.click(save);
		Thread.sleep(2000);
		Utility.click(save1);
		String customerName = labelFirstCustomerName.getText();
		Utility.enterText(textBoxSearch, customerName);
		if (customerName.equals(labelFirstCustomerName.getText())) {
			et.log(LogStatus.PASS, "Matching customer is displayed",
					et.addScreenCapture(pass("Matching customer is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Matching customer is not displayed",
					et.addScreenCapture(fail("Matching customer is not displayed")));
		}
	}

////////////////////////////creating customer Negative Scenario //////////////////////////////////////////

	public void createCustomerNegative() throws InterruptedException, IOException {
		Utility.click(CustomersMenuBtn);
		Thread.sleep(1000);
		Utility.JS_Scrolldown(totalCustomerCount);
		Thread.sleep(1000);
		String totalCustCount = null;
		if (totalCustomerCount.isDisplayed()) {
			totalCustCount = totalCustomerCount.getText();
			System.out.println("Expected " + totalCustCount);
		} else {
			System.out.println("Not Displayed");
		}
		Thread.sleep(1000);
		Utility.click(NewCustomer);
		Thread.sleep(2000);
		Utility.ExcelReadAndWrite(2, 2);
		Utility.implicitwait();
		Utility.click(paymentTerm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 3, "CustomerDetails") + "']")).click();
		Utility.click(customerType);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 4, "CustomerDetails") + "']")).click();
		Utility.enterText(companyWebsite, Utility.excelRead(2, 5, "CustomerDetails"));
		Utility.click(customerSource);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 6, "CustomerDetails") + "']")).click();
		Utility.click(rateYourCompany);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelReadInt(2, 7, "CustomerDetails") + "']")).click();
		Utility.click(Industry);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 8, "CustomerDetails") + "']")).click();
		Utility.click(relationship);
		Thread.sleep(2000);
		Utility.click(relationship_date);
		Utility.enterText(streetName, Utility.excelRead(2, 9, "CustomerDetails"));
		Utility.enterText(zipcode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.JS_Scrolldown(save);
		Utility.click(country);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 32, "CustomerDetails") + "']")).click();

		Thread.sleep(5000);

		Utility.click(sameAsBillingAddress);
		Thread.sleep(1000);
		Utility.click(save);
		Thread.sleep(2000);
		WebElement errorText = driver.findElement(By.xpath("//span[@class='text-red']"));
		String error = errorText.getText();
		try {
			Assert.assertNotEquals(errorText, error);
			System.out.println("error message disaplyed");
			et.log(LogStatus.PASS, "error message is displaying",
					et.addScreenCapture(pass("error message is displaying")));
		} catch (Exception ex) {
			System.out.println("error message not displayed");
			et.log(LogStatus.FAIL, "error message is not displaying",
					et.addScreenCapture(fail("error message is not displaying")));
		}
	}

//////////////////////////// Search by Customer name //////////////////////////////////////////

	public void searchCustomer() throws Exception {
		Utility.enterText(searchbox, Utility.excelRead(2, 2, "CustomerDetails"));
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(2, 2, "CustomerDetails") + "']"));
			custext = true;
		} catch (Exception e) {
			custext = false;
		}
		Thread.sleep(1000);
		try {
			Assert.assertEquals(custext, true, "Customer not created");
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created customer name found",
					et.addScreenCapture(fail("New created customer name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created customer name found",
					et.addScreenCapture(pass("New created customer name not found")));
			System.out.println("search mismatched ");
		}
	}

////////////////////////////Customer Log Activity //////////////////////////////////////////

	public void CustomerLogActivity() throws IOException, InterruptedException {
		Utility.click(customersmenubtn);
		Thread.sleep(2000);
		Utility.enterText(searchcustomer, Utility.excelRead(2, 2, "CustomerDetails"));
		Thread.sleep(2000);
		Utility.click(actionbutton);
		Utility.implicitwait();
		Utility.scrollToElement_N_click(logactivity);
		activityname.sendKeys("Testing");
		activitydescription.sendKeys("Testing Software");
		Utility.click(activitytype);
		Utility.click(activitytype1);
		Utility.click(status);
		Utility.click(statustype);
		Thread.sleep(1000);
		Utility.click(priority);
		Thread.sleep(1000);
		Utility.click(prioritytype);
		Thread.sleep(1000);
		Utility.click(calender);
		Thread.sleep(1000);
		Utility.click(date);
		Thread.sleep(1000);
		Utility.click(assignto);
		Utility.wait_N_click(assigntoname);
		Utility.implicitwait();
		Utility.click(creatactivity);
		Thread.sleep(1000);
		Utility.click(submitbtn);
		Thread.sleep(1000);
		Utility.click(customer);
		Thread.sleep(1000);
		Utility.click(customeractivity);
		String error = tesingactivitycheck.getText();
		try {
			Assert.assertNotEquals(tesingactivitycheck, error);
			System.out.println("Activity is Matching" + error);
			et.log(LogStatus.PASS, "Activity is Matching", et.addScreenCapture(pass("Activity is Matching")));
		} catch (Exception ex) {
			System.out.println("Activity is Not Matching");
			et.log(LogStatus.FAIL, "Activity is Not Matching", et.addScreenCapture(fail("Activity is Not Matching")));
		}

	}

//////////////////////////// Customer Log Communication //////////////////////////////////////////	

	public void CustomerLogCommunication() throws IOException, InterruptedException {
		Utility.click(customersmenubtn);
		Thread.sleep(2000);
		Utility.enterText(searchcustomer, Utility.excelRead(2, 2, "CustomerDetails"));
		Thread.sleep(2000);
		Utility.click(actionbutton);
		Utility.implicitwait();
		Utility.scrollToElement_N_click(logcommunication);
		Thread.sleep(2000);
		communicationmode.sendKeys("Email");
		Thread.sleep(2000);
		communicationdescription.sendKeys("Please communicate by Email only");
		Thread.sleep(2000);
		communicateto.sendKeys("vtest@gmail.com");
		Thread.sleep(1000);
		Utility.click(savebtn);
		Thread.sleep(1000);
		Utility.click(submitbutton);
		Thread.sleep(1000);
		Utility.click(customer);
		Thread.sleep(1000);
		Utility.click(customercommunication);
		Thread.sleep(1000);
		String error = emailcommunicationcheck.getText();
		try {
			Assert.assertNotEquals(emailcommunicationcheck, error);
			System.out.println("Communication Type is Matching" + error);
			et.log(LogStatus.PASS, "Communication Type is Matching",
					et.addScreenCapture(pass("Communication Type is Matching")));
		} catch (Exception ex) {
			System.out.println("Communication Type is not Matching");
			et.log(LogStatus.FAIL, "Communication Type is not Matching",
					et.addScreenCapture(fail("Communication Type is not Matching")));
		}

	}

}

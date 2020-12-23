package com.LifeStylePlan.AdminPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LifeStylePlan.Common.utils.config.CommonMethods;

public class CompanyInformationPage extends CommonMethods {
	WebDriver driver;
	public CompanyInformationPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New Company')]")
	 WebElement ADD_NEW_COMPANY_BUTTON;	
	@FindBy(how = How.XPATH, using = "//input[@id='company-name']")
	 WebElement COMPANY_INFO_COMPANY_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='phoneNumber']")
	 WebElement COMPANY_INFO_PHONE_NUMBER_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='email-domain']")
	 WebElement COMPANY_INFO_EMAIL_DOMAIN_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='white-label-prefix']")
	 WebElement COMPANY_INFO_WHITE_LABEL_PREFIX_TEXT_BOX;	
	@FindBy(how = How.XPATH, using = "//label[@id='selectedCompanyType']/following-sibling::div")
	 WebElement COMPANY_INFO_COMPANY_TYPE_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//li[text() ='Financial Planning Institution']")
	 WebElement COMPANY_INFO_COMPANY_TYPE_DROPDOWN_FINANCIAL_PLANNING_INSTITUTION;	
	@FindBy(how = How.XPATH, using = "//label[@id='selectedFamilyRelationship']/following-sibling::div")
	 WebElement COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//li[text() ='Admin']")
	WebElement COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN_ADMIN;	
	@FindBy(how = How.XPATH, using = "//label[@id='selectedClientDescription']/following-sibling::div")
      WebElement COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//Ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[3]")
	WebElement COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN_CLIENT;	
	@FindBy(how = How.XPATH, using = "//label[@id='selectedStatus']/following-sibling::div")
	 WebElement COMPANY_INFO_STATUS_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//li[text() ='Active']")
	WebElement COMPANY_INFO_STATUS_DROPDOWN_ACTIVE;
	@FindBy(how = How.XPATH, using = "//INPUT[@id='company-info-description']")
	 WebElement COMPANY_INFO_DESCRIPTION_TEXT_BOX;	
	@FindBy(how = How.XPATH, using = "//input[@id='companyAddress']")
	 WebElement COMPANY_ADDRESS_ADDRESS_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='company-city']")
	 WebElement COMPANY_ADDRESS_CITY_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//label[@id='company-state']/following-sibling::div/div")
	 WebElement COMPANY_ADDRESS_STATE_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//li[text() ='Texas']")
	WebElement COMPANY_ADDRESS_STATE_DROPDOWN_TEXAS;
	@FindBy(how = How.XPATH, using = "//input[@id='companySecondLineAddress']")
	 WebElement COMPANY_ADDRESS_SECOND_LINE_ADDRESS_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='company-zip-code']")
	 WebElement COMPANY_ADDRESS_ZIPCODE_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='company-key-contact-first-name']")
	 WebElement COMPANY_KEY_CONTACT_FIRST_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='company-key-contact-last-name']")
	 WebElement COMPANY_KEY_CONTACT_LAST_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='companyKeyContactPhoneNumber']")
	 WebElement COMPANY_KEY_CONTACT_PHONE_NUMBER_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[@id='company-key-contact-email-address']")
	 WebElement COMPANY_KEY_CONTACT_EMAIL_ADDRESS_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[contains (@id,'first_name_')]")
	 WebElement COMPANY_ADMINS_FIRST_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[contains (@id,'last_name_')]")
	 WebElement COMPANY_ADMINS_LAST_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//input[contains (@id,'email_')]")
	 WebElement COMPANY_ADMINS_EMAIL_NAME_TEXT_BOX;
	@FindBy(how = How.XPATH, using = "//div[@class='upload-image-text-link']")
	 WebElement COMPANY_BRANDING_UPLOAD_TEXT_BOX;	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next: Hierarchy')]")
	 WebElement NEXT_HIERARCHY_BUTTON;
	
	public void clickAddNewCompany() {
		ADD_NEW_COMPANY_BUTTON.click();
	}
	public void enterCompanyName(String strcompanyname) {
		COMPANY_INFO_COMPANY_NAME_TEXT_BOX.sendKeys(strcompanyname);
	}
	public void enterPhoneNumber(String strcompanyphonenumber) {
		COMPANY_INFO_PHONE_NUMBER_TEXT_BOX.sendKeys(strcompanyphonenumber);
	}
	public void enterEmailDomain(String stremaildomain) {
		COMPANY_INFO_EMAIL_DOMAIN_TEXT_BOX.sendKeys(stremaildomain);
	}
	public void enterWhiteLabelPrefix(String strwhitelabelprefix) {
		COMPANY_INFO_WHITE_LABEL_PREFIX_TEXT_BOX.sendKeys(strwhitelabelprefix);
	}
	public void selectCompanyInfoCompanyType() {	
		waitTobeClickable(COMPANY_INFO_COMPANY_TYPE_DROPDOWN);
       mouseActions(COMPANY_INFO_COMPANY_TYPE_DROPDOWN);
       mouseActions(COMPANY_INFO_COMPANY_TYPE_DROPDOWN);
       waitTobeClickable(COMPANY_INFO_COMPANY_TYPE_DROPDOWN_FINANCIAL_PLANNING_INSTITUTION);
       clickJavaScript(COMPANY_INFO_COMPANY_TYPE_DROPDOWN_FINANCIAL_PLANNING_INSTITUTION);		
	}
	public void selectCompanyInfoRelationshipManager() {
		   waitTobeClickable(COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN);
	       mouseActions(COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN);
	       mouseActions(COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN);
	       waitTobeClickable(COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN_ADMIN);
	       clickJavaScript(COMPANY_INFO_RELATIONSHIP_MANAGER_DROPDOWN_ADMIN);	
		 
	       			}
	
	public void selectClientDescription() {
		waitTobeClickable(COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN);
	       mouseActions(COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN);
	       mouseActions(COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN);
	       waitTobeClickable(COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN_CLIENT);
	       clickJavaScript(COMPANY_INFO_CLIENT_DESCRIPTION_DROPDOWN_CLIENT);
	       			}
	public void selectStatus() {
		waitTobeClickable(COMPANY_INFO_STATUS_DROPDOWN);
	       mouseActions(COMPANY_INFO_STATUS_DROPDOWN);
	       mouseActions(COMPANY_INFO_STATUS_DROPDOWN);
	       waitTobeClickable(COMPANY_INFO_STATUS_DROPDOWN_ACTIVE);
	       clickJavaScript(COMPANY_INFO_STATUS_DROPDOWN_ACTIVE);
	       			}
	

	
	public void enterDescription(String strdescription) {
		COMPANY_INFO_DESCRIPTION_TEXT_BOX.sendKeys(strdescription);
	}
	public void enterAddress(String straddress) {
		COMPANY_ADDRESS_ADDRESS_TEXT_BOX.sendKeys(straddress);
	}
	public void enterCity(String strcity) {
		COMPANY_ADDRESS_CITY_TEXT_BOX.sendKeys(strcity);
	}
	public void selectState() {
		waitTobeClickable(COMPANY_ADDRESS_STATE_DROPDOWN);
	       mouseActions(COMPANY_ADDRESS_STATE_DROPDOWN);
	       waitTobeClickable(COMPANY_ADDRESS_STATE_DROPDOWN_TEXAS);
	       clickJavaScript(COMPANY_ADDRESS_STATE_DROPDOWN_TEXAS);
	       			}
	
	public void enterSecondLineAddress(String strsecondlineaddress) {
		COMPANY_ADDRESS_SECOND_LINE_ADDRESS_TEXT_BOX.sendKeys(strsecondlineaddress);
	}
	public void enterZipcode(String strzipcode) {
		COMPANY_ADDRESS_ZIPCODE_TEXT_BOX.sendKeys(strzipcode);
	}
	public void enterCompanyFirstName(String strcompanykeycontactfirstname) {
		COMPANY_KEY_CONTACT_FIRST_NAME_TEXT_BOX.sendKeys(strcompanykeycontactfirstname);
	}
	public void enterCompanyLastName(String strcompanykeylastname) {
		COMPANY_KEY_CONTACT_LAST_NAME_TEXT_BOX.sendKeys(strcompanykeylastname);
	}
	public void enterCompanyPhoneNumber(String strcompanykeyphonenumber) {
		COMPANY_KEY_CONTACT_PHONE_NUMBER_TEXT_BOX.sendKeys(strcompanykeyphonenumber);
	}
	public void enterCompanyEmail(String strcompanykeycontactemail) {
		COMPANY_KEY_CONTACT_EMAIL_ADDRESS_TEXT_BOX.sendKeys(strcompanykeycontactemail);
	}
	public void enterCompanyAdminsFirstName(String strcompanyadminfirstname) {
		COMPANY_ADMINS_FIRST_NAME_TEXT_BOX.sendKeys(strcompanyadminfirstname);
	}
	public void enterCompanyAdminsLastName(String strcompanyadminlastname) {
		COMPANY_ADMINS_LAST_NAME_TEXT_BOX.sendKeys(strcompanyadminlastname);
	}
	public void enterCompanAdminsEmail(String strcompanyadminsemail) {
		COMPANY_KEY_CONTACT_EMAIL_ADDRESS_TEXT_BOX.sendKeys(strcompanyadminsemail);
	}
	public void clickOnNextHierarchyButton() {
		COMPANY_KEY_CONTACT_EMAIL_ADDRESS_TEXT_BOX.click();;
	}




}

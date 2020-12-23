package com.LifeStylePlan.AdminUIPages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.LifeStylePlan.AdminPages.CompanyInformationPage;
import com.LifeStylePlan.AdminPages.lspLoginsPage;
import com.LifeStylePlan.Common.utils.config.Base;

public class CompanyInformationTest extends Base{
	 @BeforeTest
	    public void beforeTestSuite() throws Exception {
		 lspLoginsTest Adminlogin = PageFactory.initElements(driver,lspLoginsTest.class);
		 Adminlogin.adminlogin();
		 	 		 	 }	
	@Test 	
	
		public void enterCompanyInfo() {
		 CompanyInformationPage companyinfopage = PageFactory.initElements(driver,CompanyInformationPage.class);
		 companyinfopage.clickAddNewCompany();		 
		 companyinfopage.enterCompanyName("WholeFoods");
		 companyinfopage.enterPhoneNumber("1231231234");
		 companyinfopage.enterEmailDomain("apple.com");
		 companyinfopage.enterWhiteLabelPrefix("apple");
		 companyinfopage.selectCompanyInfoCompanyType();		 		 		 
		 companyinfopage.selectCompanyInfoRelationshipManager();
		 companyinfopage.selectClientDescription();
		 companyinfopage.selectStatus();
		 companyinfopage.enterDescription("Grocesary store");
		 companyinfopage.enterCity("Dallas");
		 companyinfopage.selectState();
		 companyinfopage.enterSecondLineAddress("100");
		 companyinfopage.enterZipcode("75248");		
		 companyinfopage.enterCompanyFirstName("Sam");
		 companyinfopage.enterCompanyLastName("Sam");
		 companyinfopage.enterCompanyPhoneNumber("Sam");
		 companyinfopage. enterCompanyEmail("sri.telecom@gmail.com");
		 companyinfopage.enterCompanyAdminsFirstName("Sam");
		 companyinfopage.enterCompanyAdminsLastName("Sam");
		 companyinfopage.enterCompanAdminsEmail("Sam");
		 companyinfopage.clickOnNextHierarchyButton();
		
			
		}
		
	}



package com.LifeStylePlan.AdvisorPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class clientInformationPage {
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New Company')]")
	 WebElement ADD_NEW_COMPANY_BUTTON;	

}

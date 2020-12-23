package com.LifeStylePlan.AdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class lspLoginsPage {
	WebDriver driver;
	
	public lspLoginsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Login')]")
	 static WebElement login_button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	 WebElement username_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	  WebElement password_TextBox;
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Forgot Password?')]")
	  WebElement ForgotPassword;

public void enterUsername(String struserid) {
	username_Textbox.sendKeys(struserid);
}
	public void enterPassword(String strpassword) {
		password_TextBox.sendKeys(strpassword);
	}
	public void clickOnLoginButton() {
		login_button.click();
	}
}

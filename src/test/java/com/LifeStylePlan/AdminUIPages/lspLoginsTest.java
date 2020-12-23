package com.LifeStylePlan.AdminUIPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LifeStylePlan.AdminPages.lspLoginsPage;
import com.LifeStylePlan.Common.utils.config.Base;

public class lspLoginsTest extends Base {

	@Test
	public void adminlogin() throws Exception{
		lspLoginsPage loginpage = PageFactory.initElements(driver, lspLoginsPage.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterUsername("admin@lsp.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterPassword("lsp@1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.clickOnLoginButton();
	}
	
	public void advisorlogin() throws Exception{
		lspLoginsPage loginpage = PageFactory.initElements(driver, lspLoginsPage.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterUsername("advisor@lsp.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterPassword("lsp@1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.clickOnLoginButton();
	}
	public void clientlogin() throws Exception{
		lspLoginsPage loginpage = PageFactory.initElements(driver, lspLoginsPage.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterUsername("client@lsp.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.enterPassword("lsp@1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.clickOnLoginButton();
	}
	
	

}
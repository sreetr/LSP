package com.LifeStylePlan.Common.utils.config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends Base {
	
	public void mouseActions(WebElement ele) {
	
	  Actions ac = new Actions(driver);
      ac.moveToElement(ele).click().build().perform();

}
	
public void waitTobeClickable(WebElement ele) {
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public void clickJavaScript(WebElement ele) {
	
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	  exe.executeScript("arguments[0].click();",ele );
	  
	  
	
}

}

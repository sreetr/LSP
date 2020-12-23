package com.LifeStylePlan.Common.utils.config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base {

	public static WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
/*
		@BeforeTest 
		@Parameters("browserName") 
		public void setup(String browserName) {
			System.out.println();
			if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SREEKANTH\\eclipse-workspace\\LifeStylePlan\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SREEKANTH\\eclipse-workspace\\LifeStylePlan\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				} 
			else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SREEKANTH\\eclipse-workspace\\LifeStylePlan\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				} */
					
	@BeforeSuite
	public void initialize() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SREEKANTH\\eclipse-workspace\\LifeStylePlan\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
			driver.get("https://qa.lifestyleplan.com/login");
			
	}	
}





package com.SauceDemo.TestPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMPackage.PomClass_LoginFunctionality;

public class TestBaseClass 
{
   WebDriver driver;
   Logger log=Logger.getLogger("SauceDemo_30thJuly");

	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Priyanka\\SOFTWARE TESTING\\AUTOMATION TESTING\\Automation Seleium\\Selenium Install\\chromedriver_win32\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.Properties");
		log.info("browser is opened");
				
		driver.manage().window().maximize();	
		log.info("browser is maximized");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		//screenshot
//		UtilityClass.takeScreenshotMethod(driver, "LoginPg");
		
		PomClass_LoginFunctionality  lp = new PomClass_LoginFunctionality (driver);
		lp.sendUsername();
		
		lp.sendPassword();
		
		lp.clickLoginBtn();
		
		//--homePage--//
		log.info("Went on HomePage");
				
		//screenshot
//		UtilityClass.takeScreenshotMethod(driver, "HomePg");			
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("browser is closed");
				
		log.info("End of Program");
	}


}

package com.SauceDemo.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.PomClass_HomePage;

public class TC02_LogoutFunctionality extends TestBaseClass

{
	@Test
	
	public void logoutFuntionalityTest()
	{
		PomClass_HomePage hp=new PomClass_HomePage(driver);
		hp.clickSettingBtn();
		hp.clickOnLogout();
		
		System.out.println("Apply Validation");
		
		String expectedURL="https://www.saucedemo.com/";
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			log.info("Log Out Test Case passed");
		}
		else
		{
			log.info("Logout Test Case failed");
		}
	}

}

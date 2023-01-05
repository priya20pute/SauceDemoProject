package com.SauceDemo.TestPackage;

import org.testng.annotations.Test;

public class TC01_Loginfunctionality extends TestBaseClass

{
	@Test
	public void verifyLoginFunctionality()
	{
		
	String givenTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	
	if(givenTitle.equals(actualTitle))
	{
		log.info("LogIn Test Case is passed");
	}
	else
	{
		log.info("Test Case is failed");
	}
	
	}
}

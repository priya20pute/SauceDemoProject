package com.SauceDemo.TestPackage;

import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.PomClass_HomePage;

public class TC03_AddAllProdToCart extends TestBaseClass
{
	@Test
	
	public void addAllProdtoCart()
	{
		PomClass_HomePage hp=new PomClass_HomePage(driver);
	       hp.addAllProductToCart();
	       String actualNoOfItemSelected="6";
	       String totalNoOfItemSelected =hp.getTextfromAddToCart();
	       
	       if(totalNoOfItemSelected.equals(actualNoOfItemSelected))
	       {
	    	   log.info("Add to Cart AllProduct TestCase Passed");
	       }
	       else
	       {
	    	   log.info("Add to Cart AllProduct TestCase Failed");
	       }
	}

}

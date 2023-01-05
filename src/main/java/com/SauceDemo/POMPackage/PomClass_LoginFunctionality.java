package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PomClass_LoginFunctionality 
{
  private WebDriver driver;
  private Actions act;
  
  @FindBy(xpath="//input[@id='user-name']")
  WebElement username ;
  
  @FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBtn;
  
  
  public void sendUsername()
  {
	 username.sendKeys("standard_user"); 
	 System.out.println("Username Entered");
  }
  
  public void sendPassword()
  {
	  password.sendKeys("secret_sauce"); 
	 System.out.println("Password Entered");
  }
  
  public void clickLoginBtn()
  {
	  loginBtn.click();
	 System.out.println("Clicked Login Button");
  }
  
//  public void clickLoginBtn()
//  {
//	  act.click(loginBtn).perform();
//	 System.out.println("Clicked Login Button");
//  }
  
  public PomClass_LoginFunctionality(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  act=new Actions (driver);
  }
  
  
}

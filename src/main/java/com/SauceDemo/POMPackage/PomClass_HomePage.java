package com.SauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClass_HomePage 
{
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	  WebElement settingBtn ;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> addToCartAll;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement filterDropDown;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
		System.out.println("Clicked setting button");
	}
	
	public void clickOnLogout()
	{
		logout.click();
		System.out.println("Clicked Logout");
	}
	
	public void addAllProductToCart()
	{
		for(WebElement allproduct:addToCartAll)
		{
			allproduct.click();
		}
		
	}
	
	public void applyFilter()
	{
		filterDropDown.click();
		s.selectByIndex(2);
		System.out.println("Filter option selected and applied");
	}
	
	public String getTextfromAddToCart()
	{
		String totalProductSelected=addToCartBtn.getText();
		return totalProductSelected;
	}
	
	
	public PomClass_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s=new Select (filterDropDown);
	
	}	

}

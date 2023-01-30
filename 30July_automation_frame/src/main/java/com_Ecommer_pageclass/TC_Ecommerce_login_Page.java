package com_Ecommer_pageclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_Ecommer_baseclass.Ecommerce_BaseClass;

public class TC_Ecommerce_login_Page extends Ecommerce_BaseClass 
{
	public TC_Ecommerce_login_Page()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	public WebElement username;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement login;
	
	public void SetUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void SetPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void button()
	{
		login.click();
	
	  
	
	}
}

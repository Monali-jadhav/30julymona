package com_Ecommer_baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com_Ecommer_utilities.TestUtils;

public class Ecommerce_BaseClass 
{  public static WebDriver driver;
	@BeforeMethod
  public void Setup()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGELOAD, TimeUnit.SECONDS);
	  
	  driver.get("https://demo.nopcommerce.com/login");
  }
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}

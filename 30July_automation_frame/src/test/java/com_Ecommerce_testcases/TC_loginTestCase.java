package com_Ecommerce_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com_Ecommer_baseclass.Ecommerce_BaseClass;
import com_Ecommer_pageclass.TC_Ecommerce_login_Page;

public class TC_loginTestCase extends Ecommerce_BaseClass 
 { 
	@Test
   public void loginTestCase()
   {
	   TC_Ecommerce_login_Page tel = new TC_Ecommerce_login_Page();
	   tel.SetUsername("monalijadhav1405@gmail.com");
	   tel.SetPassword("Dell@1234");
	   tel.button();
	   
	   if(driver.getTitle().equals("nopCommerce demo s"))
	   {
		   Assert.assertTrue(true);
	   }
	   else 
	   {
		   Assert.assertTrue(false);
	   }
   }
 }

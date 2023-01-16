 package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LoginPage;

public class InventaryPageTest extends TestBase{

	LoginPage login; 
	InventaryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
		invent = new InventaryPage();
		login.LogintoApp();
	}
	
	
	@Test (enabled = false)
	public void verifyProductLogoTest()
	{
		String expResult = "PRODUCTS"; 
		String actResult = invent.verifyProductLogo();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Label title = " + actResult);
	}
	@Test (enabled = false)
	public void verifypeekLogoTest()
	{
		boolean actResult = invent.verifypeekLogo();
		Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyappLogoTest()
	{
		boolean actResult = invent.verifyappLogo();
		Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyproductSortDrowpdownTest()
	{
		invent.verifyproductSortDrowpdown();
	}
	@Test (enabled = false)
	public void verifyTwitterLogoTest()
	{
		 boolean actResult = invent.verifyTwitterLogo();
		 Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyFacebookLogoTest()
	{
		boolean actResult = invent.verifyFacebookLogo();
		Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyLinkedInLogoTest()
	{
		boolean actResult = invent.verifyLinkedInLogo();
		Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyfooterRobotLogoTest()
	{
		boolean actResult = invent.verifyfooterRobotLogo();
		Assert.assertEquals(actResult, true);
	}
	@Test (enabled = false)
	public void verifyFooterLableTest()
	{
		String expResult = "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String actResult = invent.verifyFooterLable();
		Assert.assertEquals(expResult, actResult);
	}
	@Test (enabled = false)
	public void verifyshoppingCartTest() 
	{
		boolean actResult = invent.verifyshoppingCart();
		Assert.assertEquals(actResult, true);
	}
	@Test
	public void verifyProductCount() throws Exception
	{
		 String actResult = invent.verifyProductCount();
		 Assert.assertEquals(actResult, "4");
		 Reporter.log("Cart Product Count = " +actResult);
	}
	@Test (enabled = false)
	public void verifyCartUrlTest() 
	{
		String expResult = "https://www.saucedemo.com/cart.html";
		String actResult = invent.verifyCartUrl();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Cart Link = " +actResult);
	}
	
	
	@Test(enabled = false)
	public void verifymenuButtonDroupdowntest()
	{
		String expResult = "https://saucelabs.com/";
		String actResult = invent.verifymenuButtonDroupdown();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("About URL = " +actResult);	
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
}

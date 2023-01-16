package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InformationPage;
import Pages.InventaryPage;
import Pages.LoginPage;
import Pages.OverviewPage;

public class OverviewPageTest extends TestBase {
	
	LoginPage login; // = new LoginPage();
	InventaryPage invent; // = new InventaryPage();
	CartPage cart; // = new CartPage();
	InformationPage info; // = new InformationPage();
	OverviewPage view; // = new OverviewPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
		invent = new InventaryPage();
		cart = new CartPage();
		info = new InformationPage();
		view = new OverviewPage();
		login.LogintoApp();
		invent.verifyProductCount();
		cart.verifycheckoutBtn();
		info.verifyDetails();
	}
	@Test (enabled = false)
	public void verifyCurrentURLTest() throws Exception
	{
		String expResult = "https://www.saucedemo.com/checkout-step-two.html";
		String actResult = view.verifyCurrentURL();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Veify Overview Page URL = "  +actResult);
	}
	@Test (enabled = false)
	public void verifyTitleTextTest()
	{
		String expResult = "Checkout: Overview";
		String actResult = view.verifyTitleText();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Veify Overview Page Title Text " +actResult);
	}
	@Test (enabled = false)
	public void verifyappLogoTest()
	{
		boolean result = view.verifyappLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifyfinishBTn()
	{
		boolean result = view.verifyfinishBTn();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyfinshBtnClickTest()
	{
		view.verifyfinshBtnClick();
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}

}

package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CompletePage;
import Pages.InformationPage;
import Pages.InventaryPage;
import Pages.LoginPage;
import Pages.OverviewPage;
import Utility.UtilityMethod;

public class CompletePageTest extends TestBase{
	
	LoginPage login; // = new LoginPage();
	InventaryPage invent; // = new InventaryPage();
	CartPage cart; // = new CartPage();
	InformationPage info; // = new InformationPage();
	OverviewPage view; // = new OverviewPage();
	CompletePage comp; // = new CompletePage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
		invent = new InventaryPage();
		cart = new CartPage();
		info = new InformationPage();
		view = new OverviewPage();
		comp = new CompletePage();
		login.LogintoApp();
		invent.verifyProductCount();
		cart.verifycheckoutBtn();
		info.verifyDetails();
		view.verifyfinshBtnClick();
	}
	@Test (enabled = false)
	public void verifyCompletePageUrlTest()
	{
		String expResult = "https://www.saucedemo.com/checkout-complete.html";
		String actresult = comp.verifyCompletePageUrl();
		Assert.assertEquals(expResult, actresult);
		Reporter.log("Complete Page URL Verify = " +actresult);
	}
	@Test (enabled = false)
	public void verifytitleTextTest()
	{
		String expResult = "CHECKOUT: COMPLETE!";
		String actResult = comp.verifytitleText();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Complete Page Title = " +actResult);
	}
	@Test (enabled = false)
	public void verifyfirstHeaderTextTest()
	{
		String expResult = "THANK YOU FOR YOUR ORDER";
		String actResult = comp.verifyfirstHeaderText();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("First Header in Complete Page = " +actResult);
	}
	@Test (enabled = false)
	public void verifysecondHederTextTest()
	{
		String expResult = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actResult = comp.verifysecondHederText();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Second Header in Conmplete Page = " +actResult);	
	}
	@Test (enabled = false)
	public void verifyappLogoTest()
	{
		boolean result = comp.verifyappLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifyponyLogoTest()
	{
		boolean result = comp.verifyponyLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifybacktoHomeBtnTest()
	{
		 boolean result = comp.verifybacktoHomeBtn();
		 Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifybacktoHomeBtnClickTest()
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = comp.verifyafterClickHomeBtnUrl();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("After Click on Back to Home Button URL = " +actResult);
	}
	@Test
	public void verifyLogoutBtnTest()
	{
		String expResult = "https://www.saucedemo.com/";
		String actResult = comp.verifyLogoutBtn();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("After click Logout Button verify URL = " +actResult);
	}
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
			UtilityMethod.captureScreenshot(a.getName());
		}
		driver.close();
	}

}

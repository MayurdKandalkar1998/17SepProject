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

public class InformationPageTest extends TestBase {
	
	LoginPage login = new LoginPage();
	InventaryPage invent = new InventaryPage();
	CartPage cart = new CartPage();
	InformationPage info = new InformationPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
		invent = new InventaryPage();
		cart = new CartPage();
		info = new InformationPage();
		login.LogintoApp();
		invent.verifyProductCount();
		cart.verifycheckoutBtn();
	}
	@Test (enabled = false)
	public void verifyInformationTitleTest()
	{
		String expResult = "CHECKOUT: YOUR INFORMATION";
		String actResult = info.verifyinformationTitle();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Information page title = " +actResult);
	}
	@Test (enabled = false)
	public void verifycancleBtnTest()
	{
		boolean result = info.verifycancleBtn();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifycontinueBtnTest()
	{
		boolean result = info.verifycontinueBtn();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyDetails() throws Exception
	{
		info.verifyDetails();
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}

}

package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventaryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage login; // = new LoginPage();
	InventaryPage invent; // = new InventaryPage();
	CartPage cart; // = new CartPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
		invent = new InventaryPage();
		cart = new CartPage();
		login.LogintoApp();
		invent.verifyProductCount();
	}
	@Test (enabled = false)
	public void verifyAppLogoTest()
	{
		boolean result = cart.verifyappLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifyshoopingCartTest()
	{
		boolean result = cart.verifyshoppingCart();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifycartTitleTest()
	{
		String expResult = "YOUR CART ";
		String actResult = cart.verifycartTitle();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Cart Title = " +actResult);
	}
	@Test (enabled = false)
	public void verifyqueLableTest()
	{
		String expResult = "QTY";
		String actResult = cart.verifyqueLable();
		Assert.assertEquals(expResult, actResult); 
		Reporter.log("Qty Lable = " +actResult);
	}
	@Test (enabled = false)
	public void verifydescLableTest()
	{
		String expResult = "DESCRIPTION";
		String actResult = cart.verifydescLable();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Description Lable = " +actResult);
	}
	@Test (enabled = false)
	public void verifyconBtnTest()
	{
		boolean result = cart.verifyconBtn();
		Assert.assertEquals(result, true);
	} 
	@Test (enabled = false)
	public void checkoutBtnTest()
	{
		boolean result = cart.checkoutBtn();
		Assert.assertEquals(result, true);
	}
	@Test
	public void removecartTest() throws Exception
	{
		cart.removeAddCart();
	}
	@Test
	public void verifycheckoutBtnTest()
	{
		String expResult = "https://www.saucedemo.com/checkout-step-one.html";
		String actResult = cart.verifycheckoutBtn();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Information Link = " +actResult);
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}

}

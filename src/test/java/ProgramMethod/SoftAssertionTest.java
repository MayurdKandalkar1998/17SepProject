package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;

public class SoftAssertionTest extends TestBase{
	
	
LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (invocationCount = 1,enabled = true)
	public void verifyTitleText()
	{
		System.out.println("Execution Started");
		SoftAssert soft = new SoftAssert();
		String expTitle = "1Swag Labs";
		String actTitle = login.verifyTitleText();
		soft.assertEquals(actTitle, expTitle);
		soft.assertAll();
		//Assert.assertEquals(actTitle, expTitle);
		System.out.println("Execution Ended");
	}
	
	@Test (enabled = false,timeOut = 2000)
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL, "Test Case Pass Zali ka");
		System.out.println("This is a test case of Title");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}

}

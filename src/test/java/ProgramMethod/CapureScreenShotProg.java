package ProgramMethod;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CapureScreenShotProg extends TestBase{
	
LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (enabled = true)
	public void verifyTitleText()
	{
		String expTitle = "Swag. Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (enabled = true)
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test (enabled = true)
	public void loginToAPPTest() throws Exception
	{
		String ExpResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.LogintoApp();
		Assert.assertEquals(actResult, ExpResult);
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus() )
		{
			UtilityMethod.captureScreenshot(a.getName());
		}
		
		driver.close();
	}


}

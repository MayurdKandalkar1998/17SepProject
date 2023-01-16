package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsOnMethod extends TestBase {
LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test 
	public void verifyTitleText()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (dependsOnMethods = "verifyTitleText")
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test (dependsOnMethods = {"verifyTitleText","verifyURL"})
	public void verifyLoginLogoTest()
	{
		 boolean Result = login.verifyLoginLogo();
		 Assert.assertEquals(Result, true);
	}
	
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}


}

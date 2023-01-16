package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	
LoginPage login; // = new LoginPage();
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (groups = {"Sanity","Regression"})
	public void verifyTitleText()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (groups = {"Smoke","Regression"})
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test (groups = "Smoke")
	public void verifyLoginLogoTest()
	{
		 boolean Result = login.verifyLoginLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (groups = "Sanity")
	public void verifyBotLogoTest() 
	{
		 boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (groups = "Smoke")
	public void verifyacceptUserNametest()
	{
		login.acceptUserName();
		System.out.println(login.acceptUserName());
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}


}

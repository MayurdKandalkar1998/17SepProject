package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class ProrityMethod extends TestBase {
	
LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (priority = 1, groups = "Sanity")
	public void verifyTitleText()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (priority = 3)
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test (priority = 2)
	public void verifyLoginLogoTest()
	{
		 boolean Result = login.verifyLoginLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (priority = 5)
	public void verifyBotLogoTest() 
	{
		 boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (priority = 4)
	public void verifyacceptUserNametest()
	{
		login.acceptUserName();
		System.out.println(login.acceptUserName());
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}


}

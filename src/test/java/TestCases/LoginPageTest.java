package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (enabled = false)
	public void verifyTitleText()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (enabled = false)
	public void verifyURL()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test (enabled = false)
	public void verifyLoginLogoTest()
	{
		 boolean Result = login.verifyLoginLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (enabled = false)
	public void verifyBotLogoTest() 
	{
		 boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);
	}
	
	@Test (enabled = false)
	public void verifyacceptUserNametest()
	{
		login.acceptUserName();
		System.out.println(login.acceptUserName());
	}
	@Test (enabled = false)
	public void verifyAcceptUserPassword()
	{
		login.acceptPassword();
		System.out.println(login.acceptPassword());
	}
	
	@Test (enabled = true)
	public void loginToAPPTest() throws Exception
	{
		String ExpResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.LogintoApp();
		Assert.assertEquals(actResult, ExpResult);
		
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}

}

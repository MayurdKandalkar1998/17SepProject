package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class Timeout extends TestBase {
LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test (timeOut = 2000)        // to verify a test case pass when given timeout.
	public void verifyTitleText()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleText();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}
}

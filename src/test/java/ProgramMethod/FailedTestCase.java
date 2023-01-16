package ProgramMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class FailedTestCase extends TestBase{
	
	LoginPage login; // = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initilazation();
		login = new LoginPage();
	}
	
	@Test 
	public void Test1()
	{
		boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);	}
	@Test 
	public void Test2()
	{
		boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);
	}
	@Test 
	public void Test3()
	{
		boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);	}
	@Test 
	public void Test4()
	{
		boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, false);
	}
	@Test 
	public void Test5()
	{
		boolean Result = login.verifyBotLogo();
		 Assert.assertEquals(Result, true);
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(2000);
		driver.close();
	}


}

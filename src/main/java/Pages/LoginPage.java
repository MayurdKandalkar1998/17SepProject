package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement LoginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement Botlogo;
	@FindBy(xpath = "//div[@id='login_credentials']") private WebElement acceptUserName;
	@FindBy(xpath = "//div[@class='login_password']") private WebElement acceptPassword;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement loginUserName;
	@FindBy(xpath = "//input[@id='password']") private WebElement loginPassword;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginButton;
	
	
	public LoginPage() // this is the constructor of page. copy class name pest it.
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitleText()
	{
		return driver.getTitle();
	}
	
	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyLoginLogo()
	{
		return LoginLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return Botlogo.isDisplayed();
	}
	public String acceptUserName()
	{
		return acceptUserName.getText();
		
	}
	public String acceptPassword() 
	{
		return acceptPassword.getText();
	}
	public String LogintoApp() throws Exception 
	{
		loginUserName.sendKeys(ReadData.readPropertyFile("username"));
		loginPassword.sendKeys(ReadData.readPropertyFile("password"));
//		loginPassword.sendKeys(ReadData.readExcelFile(0, 0));
		loginButton.click();
		
		return driver.getCurrentUrl();
	}

	
}

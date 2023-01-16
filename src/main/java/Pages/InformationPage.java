package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class InformationPage extends TestBase{
	
	@FindBy(xpath = "//span[@class = 'title']") private WebElement informationTitle;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCode; 
	@FindBy(xpath = "//button[@id='cancel']") private WebElement cancleBtn;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;
	
	public InformationPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyinformationTitle()
	{
		return informationTitle.getText();
	}
	public boolean verifycancleBtn()
	{
		return cancleBtn.isDisplayed();
	}
	public boolean verifycontinueBtn()
	{
		return continueBtn.isDisplayed();
	}
	public void verifyDetails() throws Exception
	{
		firstName.sendKeys(ReadData.readPropertyFile("first_Name"));
		Thread.sleep(2000);
		lastName.sendKeys(ReadData.readPropertyFile("last_Name"));
		Thread.sleep(2000);
		postalCode.sendKeys(ReadData.readPropertyFile("postal_Code"));
		Thread.sleep(2000);
		continueBtn.click();
		
	}
}

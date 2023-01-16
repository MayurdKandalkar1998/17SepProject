package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class CompletePage extends TestBase{
	
	@FindBy(xpath = "//span[@class='title']") private WebElement titleText;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//h2[@class='complete-header']") private WebElement firstHeaderText;
	@FindBy(xpath = "//div[@class='complete-text']") private WebElement secondHederText;
	@FindBy(xpath = "//img[@class='pony_express']") private WebElement ponyLogo;
	@FindBy(xpath = "//button[@id='back-to-products']") private WebElement backtoHomeBtn;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement logoutBtn;
	
	public CompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCompletePageUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifytitleText()
	{
		return titleText.getText();
	}
	public String verifyfirstHeaderText()
	{
		return firstHeaderText.getText();
	}
	public String verifysecondHederText()
	{
		return secondHederText.getText();
	}
	public boolean verifyappLogo()
	{
		return appLogo.isDisplayed();
	}
	public boolean verifyponyLogo()
	{
		return ponyLogo.isDisplayed();
	}
	public boolean verifybacktoHomeBtn()
	{
		return backtoHomeBtn.isDisplayed();
	}
	public String verifyafterClickHomeBtnUrl()
	{
		backtoHomeBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyLogoutBtn()
	{
		menuBtn.click();
		UtilityMethod.actionMethod(driver, logoutBtn);
		return driver.getCurrentUrl();
	}
	
}

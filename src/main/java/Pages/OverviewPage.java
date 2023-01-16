package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OverviewPage extends TestBase{

	@FindBy(xpath = "//span[@class='title']") private WebElement titleText;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;
	
	public OverviewPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	public String verifyTitleText()
	{
		return titleText.getText();
	}
	public boolean verifyappLogo()
	{
		return appLogo.isDisplayed();
	}
	public boolean verifyfinishBTn()
	{
		return finishBtn.isDisplayed();
	}
	public void verifyfinshBtnClick()
	{
		finishBtn.click();
	}
}

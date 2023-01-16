package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class InventaryPage extends TestBase {
	
	@FindBy(xpath = "//span[@class='title']") private WebElement productLogo;
	@FindBy(xpath = "//div[@class='peek']") private  WebElement peekLogo;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menuButtonDroupdown;
	@FindBy(xpath = "//a[@id='about_sidebar_link']") private WebElement aboutBtn;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement productSortDrowpdown;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backpack;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement jacket;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement onesie;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tshirt;
	@FindBy(xpath = "//a[text() = 'Twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[text() = 'Facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//a[text() = 'LinkedIn']") private WebElement linkedInLogo;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement footerRobotLogo;
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement footerLable;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement shoppingCart;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCount;
	
	
	public InventaryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyProductLogo()
	{
		return productLogo.getText();
	}
	public boolean verifypeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifyappLogo()
	{
		return appLogo.isDisplayed();
	}
	public String verifymenuButtonDroupdown()
	{
		menuButtonDroupdown.click();
		UtilityMethod.actionMethod(driver, aboutBtn);
		return driver.getCurrentUrl();
	}
	public void verifyproductSortDrowpdown()
	{
		UtilityMethod.SlectMethod(productSortDrowpdown, "Name (Z to A)");
	}
	public boolean verifyTwitterLogo()
	{
		return twitterLogo.isDisplayed();
	}
	public boolean verifyFacebookLogo()
	{
		return facebookLogo.isDisplayed();
	}
	public boolean verifyLinkedInLogo()
	{
		return linkedInLogo.isDisplayed();
	}
	public boolean verifyfooterRobotLogo()
	{
		return footerRobotLogo.isDisplayed();
	}
	public String verifyFooterLable()
	{
		return footerLable.getText();
	}
	public boolean verifyshoppingCart()
	{
		return shoppingCart.isDisplayed();
	}
	public String verifyProductCount() throws Exception
	{
		backpack.click();
		onesie.click();
		jacket.click();
		tshirt.click();
		Thread.sleep(3000);
		productCount.click();
		return productCount.getText();
	}
	public String verifyCartUrl()
	{
		shoppingCart.click();
		return driver.getCurrentUrl();
	}

}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement shoppingCart;
	@FindBy(xpath = "//span[@class='title']") private WebElement cartTitle;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement queLable;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement descLable;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement conBtn;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkoutBtn;
	@FindBy(id = "remove-sauce-labs-backpack") private WebElement backpack;
	@FindBy(id = "remove-sauce-labs-fleece-jacket") private WebElement jacket;
	@FindBy(id = "remove-sauce-labs-bolt-t-shirt") private WebElement tshirt;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bakeLite;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyappLogo()
	{
		return appLogo.isDisplayed();
	}
	public boolean verifyshoppingCart()
	{
		return shoppingCart.isDisplayed();
	}
	public String verifycartTitle()
	{
		return cartTitle.getText();
	}
	public String verifyqueLable()
	{
		return queLable.getText();
	}
	public String verifydescLable()
	{
		return descLable.getText();
	}
	public boolean verifyconBtn()
	{
		return conBtn.isDisplayed();
	}
	public boolean checkoutBtn()
	{
		return checkoutBtn.isDisplayed();
	}
	public void removeAddCart() throws Exception
	{
		jacket.click();
		Thread.sleep(2000);
		conBtn.click();
		Thread.sleep(2000);
		bakeLite.click();
		Thread.sleep(2000);
		shoppingCart.click();
	}
	public String verifycheckoutBtn()
	{
		checkoutBtn.click();
		return driver.getCurrentUrl();
	}
	

}

package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase {
	
	public static void SlectMethod(WebElement ele, String option)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(option);
	}
	public static void actionMethod(WebDriver driver, WebElement button)
	{
		Actions s = new Actions(driver);
		s.moveToElement(button).click().build().perform();
	}
	public static void captureScreenshot(String name) throws Exception
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\Mayur\\eclipse-workspace\\Project17Sep2022\\Screenshot\\"+name+".jpeg");
		 FileUtils.copyFile(source, destination);
	}

}

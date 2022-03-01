package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aspire.web.automation.utilities.Utilities;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enter_username() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("username_field"))).sendKeys(Utilities.FetchSiteData("username"));;
	}
	
	public void enter_password() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("password_field"))).sendKeys(Utilities.FetchSiteData("password"));;
	}
	
	public void submit() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("submit_button"))).click();
	}
}

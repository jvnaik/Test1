package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aspire.web.automation.utilities.Utilities;

public class Logout {

	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logoutuser() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("logout_button"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("logout_dropdown"))).click();
	}
	
	
}

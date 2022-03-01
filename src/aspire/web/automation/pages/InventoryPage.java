package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aspire.web.automation.utilities.Utilities;

public class InventoryPage {

	WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigatetoproducts() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("products_button"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("products_dropdown"))).click();
	}
	
	
	
}

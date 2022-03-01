package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aspire.web.automation.utilities.Utilities;

public class ProductsPage {

	WebDriver driver;
	
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createproducts() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("create_record_button_products"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("enter_product_name_products"))).sendKeys(Utilities.FetchSiteData("product_name"));
		driver.findElement(By.xpath(Utilities.FetchElementLocators("save_button"))).click();
		Thread.sleep(2000);
	}
	
	public void updatequantity() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("update_quantity_button"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("create_record_button_update_quantity"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("input_inventory_quantity"))).sendKeys(Utilities.FetchSiteData("product_quantity"));
		driver.findElement(By.xpath(Utilities.FetchElementLocators("body"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("apply_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("ok_button_update_inventory"))).click();
	}
	
	public void navigatetohome() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("home_menu"))).click();
	}
	
}

package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import aspire.web.automation.utilities.Utilities;

public class ManufacturingPage {

	WebDriver driver;
	public String s1;
	
	public ManufacturingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void CreateManufacturingRecord() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("create_record_button_manufacturing"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("enter_product_name_manufacturing"))).sendKeys(Utilities.FetchSiteData("product_name"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("body"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("add_new_line_manufacturing"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("enter_product_name_manufacturing_2"))).sendKeys(Utilities.FetchSiteData("product_name"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("body"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("body"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("confirm_button_manufacturing"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("save_record_manufacturing"))).click();
		Thread.sleep(5000);
	}
	
	public void MarkasDone() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("mark_as_done"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("apply_button_manudacturing"))).click();
		Thread.sleep(5000);
	}
	
	public void GetManufacturingOrderNo() throws IOException
	{
		WebElement man_name = driver.findElement(By.xpath(Utilities.FetchElementLocators("manufacturing_order_no")));
		s1 = man_name.getText();
	}
	
	public void SearchDoneOrder() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("manufacturing_button1"))).click();
		driver.findElement(By.xpath(Utilities.FetchElementLocators("remove_filter"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Utilities.FetchElementLocators("search_manufacturing"))).sendKeys(s1);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.ENTER).perform();
	}
}

package aspire.web.automation.assertions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import aspire.web.automation.utilities.Utilities;

public class Assertions {
	
	WebDriver driver;
	
	public Assertions(WebDriver driver)
	{
		this.driver=driver;
	}

	public static boolean findelement(WebDriver driver, String expectedvalue) throws IOException
	{
		boolean b = false;
		String s1 = "";
		try
		{
			s1 = driver.findElement(By.xpath(Utilities.FetchElementLocators("product_location"))).getText();
			System.out.println(s1);
			if(s1.equalsIgnoreCase(expectedvalue))
			{
				b = true;
			}
		}
		catch(Exception e)
		{}
		return b;
	}
	
}

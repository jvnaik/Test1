package aspire.web.automation.driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import aspire.web.automation.utilities.Utilities;

public class InitializeDriver {

	public WebDriver driver;
	
	@BeforeSuite
	public void driverstart() throws IOException
	{
		
		if(Utilities.FetchSiteData("browser_name").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Utilities.FetchSiteData("driver_path"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Utilities.FetchSiteData("URL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if (Utilities.FetchSiteData("browser_name").equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", Utilities.FetchSiteData("driver_path"));
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get(Utilities.FetchSiteData("URL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if (Utilities.FetchSiteData("browser_name").equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", Utilities.FetchSiteData("driver_path"));
			driver = new InternetExplorerDriver();	
			driver.manage().window().maximize();
			driver.get(Utilities.FetchSiteData("URL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("Kindly specify the correct browser & driver location!!!");
		}
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\91962\\eclipse-workspace-2\\BDDAutomation\\Drivers\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		
	}
	
	@AfterSuite
	public void driverstop() 
	{
		driver.quit();
	}
	
}

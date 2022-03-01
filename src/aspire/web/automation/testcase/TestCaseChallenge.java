package aspire.web.automation.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import aspire.web.automation.assertions.Assertions;
import aspire.web.automation.driver.InitializeDriver;
import aspire.web.automation.pages.ApplicationPage;
import aspire.web.automation.pages.InventoryPage;
import aspire.web.automation.pages.LoginPage;
import aspire.web.automation.pages.Logout;
import aspire.web.automation.pages.ManufacturingPage;
import aspire.web.automation.pages.ProductsPage;
import aspire.web.automation.utilities.Utilities;


public class TestCaseChallenge extends InitializeDriver{

	//Login to webpage
	@Test(priority=1)
	public void Loginfunctionality() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username();
		login.enter_password();
		login.submit();
	}
	
	//Navigate to Inevntory page
	@Test(priority=2)
	public void NavigatetoInventory() throws IOException
	{
		ApplicationPage app = new ApplicationPage(driver);
		app.inventory();
	}
	
	//Navigate to Products page
	@Test(priority=3)
	public void NavigatetoProducts() throws IOException
	{
		InventoryPage inv = new InventoryPage(driver);
		inv.navigatetoproducts();
	}
	
	//Create new product
	@Test(priority=4)
	public void CreateProducts() throws IOException, InterruptedException
	{
		ProductsPage prod = new ProductsPage(driver);
		prod.createproducts();
	}
	
	//Update Inventory Value
	@Test(priority=5)
	public void UpdateInventory() throws IOException, InterruptedException
	{
		ProductsPage prod = new ProductsPage(driver);
		prod.updatequantity();
		prod.navigatetohome();
	}
	
	//Navigate to Manufacturing
	@Test(priority=6)
	public void NavigatetoManufacturing() throws IOException
	{
		ApplicationPage app = new ApplicationPage(driver);
		app.manufacturing();
	}
	
	//Create and complete Manufacturing Order
	@Test(priority=7)
	public void CreateAndCompleteManufacturingOrder() throws IOException, InterruptedException
	{
		ManufacturingPage man = new ManufacturingPage(driver);
		man.CreateManufacturingRecord();
		man.MarkasDone();
		man.GetManufacturingOrderNo();
		man.SearchDoneOrder();
	}
	
	//Verify the Manufacturing Order Status
	@Test(priority=8)
	public void ValidateManufacturingOrderStatus() throws IOException, InterruptedException
	{
		boolean b = Assertions.findelement(driver, Utilities.FetchSiteData("product_state"));
		Assert.assertTrue(b, "Validation Failed!!!");
	}
	
	//Logout from webpage
	@Test(priority=9)
	public void LogoutUser() throws IOException, InterruptedException
	{
		Logout log = new Logout(driver);
		log.logoutuser();
	}
}

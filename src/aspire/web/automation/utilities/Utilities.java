package aspire.web.automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	
	public static String FetchElementLocators(String key1) throws IOException
	
	{
		
		FileInputStream file1 = new FileInputStream("./Properties/Element Locators.properties");
		Properties property1 = new Properties();
		property1.load(file1);
		return property1.get(key1).toString();
		
	}
	
	public static String FetchSiteData(String key2) throws IOException
	
	{
		
		FileInputStream file2 = new FileInputStream("./Properties/Sitedata.properties");
		Properties property2 = new Properties();
		property2.load(file2);
		return property2.get(key2).toString();
		
	}
	
	

}

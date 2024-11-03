package hooksDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp 
{
	//create webdriver for thread loacal
	public static WebDriver driver;
	
	//declare webdriver type variable
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal <WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver()
	{
		//initialize driver
		driver=new ChromeDriver();
		tdriver.set(driver);
		return driver;
		
	}

}

package KiteBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KiteUtility.Utility;

public class Base {
	protected static WebDriver driver;
	public void browserSetUp() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get(Utility.dataReadFromPropertyFile("URL"));
		
	}
	public void browserSetUpforChrome() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		
	}
	public void browserSetUpforFireFox() throws IOException
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\91860\\Desktop\\26March B batch\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		
	}

	
}

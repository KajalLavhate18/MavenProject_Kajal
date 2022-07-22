package KiteTest_TestNg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMclasses.HomePage;
import KitePOMclasses.LoginPage;
import KitePOMclasses.PinPage;
import KiteUtility.Utility;

public class KiteTestPropertyFile extends Base {
	LoginPage login;
	PinPage Pin;
	HomePage home;
	String SSID="23";
	
	@BeforeClass
	public void BrowserLaunch() throws IOException {
		browserSetUp();
		login=new LoginPage(driver);
		Pin=new PinPage(driver);
		home=new HomePage(driver);
		
		
	}
	@BeforeMethod
	public void LoginKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.dataReadFromPropertyFile("USERID"));
		login.sendPassword(Utility.dataReadFromPropertyFile("PWD"));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Pin.sendPin(Utility.dataReadFromPropertyFile("PIN"));
		Pin.clickContinueButton();
	}
  @Test
  public void validateUser_Id() throws EncryptedDocumentException, IOException {
	  
	  Assert.assertEquals(home.getActualUserId(), Utility.dataReadFromPropertyFile("USERID"));
	  Utility.pickScreenshot( SSID);
  }
  @AfterMethod
  public void LogoutKiteApp() throws InterruptedException {
	  home.clickLogoutButton();
	  
	  
  }
  @AfterClass
  public void BrowserClosed() {
	  
	  driver.close();
	  
  }
  
}




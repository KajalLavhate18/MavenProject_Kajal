package KitePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void ValidateUserId() 
	{
		String actualId = userId.getText();
		String expectedId="ELR321";
		if(expectedId.equals(actualId))
		{
			System.out.println("Id matching TC passed");
		}
		else {
			System.out.println("Id not matching TC Failed");
			
		}
		
	}
	public String getActualUserId()
	{
		String ActualUid = userId.getText();
		return ActualUid;
	}
	
	public void clickLogoutButton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		LogoutButton.click();
	}
	
	

}


package KitePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath ="//button[@type='submit']")private WebElement continueButton;
	//2.constructor
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Method
	public void sendPin(String pin) 
	{
		PIN.sendKeys(pin);
	}
	public void clickContinueButton()
	{
		continueButton.click();
	}

}

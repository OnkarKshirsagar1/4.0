package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {

	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContinueButton;
	
	public PinPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPin(String PIN) {
		Pin.sendKeys(PIN);
	}
	
	public void ClickContinue() {
		ContinueButton.click();
	}
}

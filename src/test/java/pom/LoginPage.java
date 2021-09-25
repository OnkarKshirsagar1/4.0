package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement UserID;	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserID(String ID){
		UserID.sendKeys(ID);
	}
	
	public void EnterPassword(String Pwd) {
		PWD.sendKeys(Pwd);
	}
	
	public void ClickLoginButton() {
		LoginButton.click();
	}

}

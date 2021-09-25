package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ID;
	@FindBy(xpath = "//div[@class='dropdown-nav layer-2']//ul//li[9]") private WebElement Signout;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		
	}
	
	public String GetTextOfID() {
		String ActualID=ID.getText();
		return ActualID;				
	}
	
	
	
	public void clickOnID(){
		ID.click();		
	}

	public void clickOnSignout() {
		Signout.click();
	}
}

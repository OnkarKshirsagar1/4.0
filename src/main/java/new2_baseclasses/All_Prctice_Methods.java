package new2_baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Prctice_Methods {
	public static WebDriver driver;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
public void browserinitialize() {
//===============Set properties of ChromeDriver and WeBdriver=============
			System.setProperty("webdriver.chrome.driver","F:\\Eclipse Projects\\Velocity Selenium\\Chrome Driver\\chromedriver.exe");
//===============Initialize the Browser===================================
			driver= new ChromeDriver();
			String baseurl="https://kite.zerodha.com/";
			driver.manage().window().maximize();
			driver.get(baseurl);
			
			driver.close();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait =new WebDriverWait(driver, 10);
			
			
}


}

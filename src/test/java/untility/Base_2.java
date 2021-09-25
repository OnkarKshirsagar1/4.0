package untility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import new2_Utility.Utility_2;

public class Base_2 {
	public WebDriver driver;
	public void browserinitialize() throws IOException {
		//===============Set properties of ChromeDriver and WeBdriver=============
				System.setProperty("webdriver.chrome.driver","F:\\Eclipse Projects\\Velocity Selenium\\Chrome Driver\\chromedriver.exe");
		//===============Initialize the Browser===================================
				driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get(Utility_2.getDatafromPropertiesFile("URL"));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
